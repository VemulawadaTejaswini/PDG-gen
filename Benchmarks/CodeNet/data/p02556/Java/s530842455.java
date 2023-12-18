import java.util.*;
import java.io.*;
import java.math.*;

public class Main{



  public static OutputStream out=new BufferedOutputStream(System.out);
  static Scanner sc=new Scanner(System.in);
  static long MOD=1000000007l;
  static int INF=10000000;
  static int[] rr=new int[]{1, 0, -1, 0};                                 //rook row move
  static int[] rc=new int[]{0, 1, 0, -1};                                 //rook col move

  //nl-->neew line; //l-->line;  //arp-->array print;  //arpnl-->array print new line
  public static void nl(Object o) throws IOException{out.write((o+"\n").getBytes()); }
  public static void l(Object o) throws IOException{out.write((o+"").getBytes());}
  public static void arp(int[] o) throws IOException{for(int i=0;i<o.length;i++) out.write((o[i]+" ").getBytes()); out.write(("\n").getBytes());}
  public static void arpnl(int[] o) throws IOException{for(int i=0;i<o.length;i++) out.write((o[i]+"\n").getBytes());}
  public static void scanl(long[] a,int n) {for(int i=0;i<n;i++) a[i]=sc.nextLong();}
  public static void scani(int[] a,int n) {for(int i=0;i<n;i++) a[i]=sc.nextInt();}
  public static void scan2D(int[][] a,int n,int m) {for(int i=0;i<n;i++) for(int j=0;j<m;j++) a[i][j]=sc.nextInt();}
  //static variables

  //


  public static void main(String[] args) throws IOException{
    long sttm=System.currentTimeMillis();
    long mod=1000000007l;

    int n=sc.nextInt();
    long[][] xy=new long[n][2];
    for(int i=0;i<n;i++){
        xy[i][0]=sc.nextLong(); xy[i][1]=sc.nextLong();
    }
    Arrays.sort(xy, new Comparator<long[]>(){
        public int compare(long[] a, long[] b){
            if(a[0]>b[0]){
                return 1;
            }
            else if(a[0]==b[0]){
                if(a[1]>b[1]){
                    return 1;
                }
                else return -1;
            }
            return -1;
        }
    });
    long[] a1=new long[]{xy[0][0],xy[0][1]};
    Arrays.sort(xy, new Comparator<long[]>(){
        public int compare(long[] a, long[] b){
            if(a[1]<b[1]){
                return 1;
            }
            else if(a[1]==b[1]){
                if(a[0]<b[0]){
                    return 1;
                }
                else return -1;
            }
            return -1;
        }
    });
    long[] a2=new long[]{xy[0][0], xy[0][1]};
    nl(Math.abs(a1[0]-a2[0])+Math.abs(a1[1]-a2[1]));

    out.flush();
  }

}

class Pair{
  int x; int y;
  Pair(int x,int y){
    this.x=x;
    this.y=y;
  }
}
