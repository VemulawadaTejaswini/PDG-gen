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

    int l=sc.nextInt(), r=sc.nextInt(), d=sc.nextInt();
    int cnt=0;
    for(int i=l;i<=r;i++){
        if(i%d==0) cnt++;
    }
    nl(cnt);

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
