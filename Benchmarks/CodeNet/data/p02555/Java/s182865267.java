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
  static long[][] pascal_trgl=new long[2005][2005];

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

    int s=sc.nextInt();
    intiTriangle();
    long ans=0;
    int n=s%3;
    while(s>=3){
        int r=s/3;
        // System.out.println(n+" "+r);
        ans=(ans+nCr(n+r-1, r-1))%mod;
        n+=3;
        s-=3;
        // nl(ans);
    }
    nl(ans);

    out.flush();
  }


  public static long nCr(int n,int r){
      return pascal_trgl[n][r]%MOD;
  }


  public static void intiTriangle(){
    for (int i = 0; i <= 2004; i++) {
      Arrays.fill(pascal_trgl[i], 0);
    }

  	pascal_trgl[0][0] = 1;

  	for (int i = 1; i <= 2004; i++) {
  		pascal_trgl[i][0] = 1;
  		for (int j = 1; j <= i; j++) {
  			pascal_trgl[i][j] = (pascal_trgl[i - 1][j - 1] + pascal_trgl[i - 1][j]) % MOD;
  		}
  	}
  }

}

class Pair{
  int x; int y;
  Pair(int x,int y){
    this.x=x;
    this.y=y;
  }
}
