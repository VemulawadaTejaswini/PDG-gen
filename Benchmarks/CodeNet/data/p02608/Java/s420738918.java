import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
  public static OutputStream out=new BufferedOutputStream(System.out);
  static Scanner sc=new Scanner(System.in);
  static long mod=1000000007l;

  //nl-->neew line; //l-->line;  //arp-->array print;  //arpnl-->array print new line
  public static void nl(Object o) throws IOException{out.write((o+"\n").getBytes());}
  public static void l(Object o) throws IOException{out.write((o+"").getBytes());}
  public static void arp(int[] o) throws IOException{for(int i=0;i<o.length;i++) out.write((o[i]+" ").getBytes()); out.write(("\n").getBytes());}
  public static void arpnl(int[] o) throws IOException{for(int i=0;i<o.length;i++) out.write((o[i]+"\n").getBytes());}
  public static void scanl(long[] a,int n) {for(int i=0;i<n;i++) a[i]=sc.nextLong();}
  public static void scani(int[] a,int n) {for(int i=0;i<n;i++) a[i]=sc.nextInt();}
  public static void scan2D(int[][] a,int n,int m) {for(int i=0;i<n;i++) for(int j=0;j<m;j++) a[i][j]=sc.nextInt();}
  //
  static long cnt;
  static TreeSet<Integer> ans;
  static int n,m;
  static boolean[][] dp,vis;
  static HashMap<Pair,Boolean> arrl;


  public static void main(String[] args) throws IOException{
    long sttm=System.currentTimeMillis();
    long mod=1000000007l;

    int n=sc.nextInt();
    int[] a=new int[n+1];
    for(int x=1;x*x<=n;x++){
        for(int y=1;y*y<=n;y++){
            for(int z=1;z*z<=n;z++){
                int val=x*x+y*y+z*z+x*y+y*z+z*x;
                if(val<=n) a[val]++;
            }
        }
    }
    for(int i=1;i<=n;i++){
        nl(a[i]);
    }

    out.flush();
  }
}

class Pair{
  int st,nd;
  Pair(int st,int nd){
    this.st=st;
    this.nd=nd;
  }
}
