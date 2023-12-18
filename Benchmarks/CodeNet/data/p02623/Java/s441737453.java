import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;

import java.util.HashMap;

import java.util.StringTokenizer;



public class Main {

  public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

  static class FastReader {

    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new
          InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String[] nextSArray() {
      String sr[] = null;
      try {
        sr = br.readLine().trim().split(" ");
      } catch (IOException e) {
        e.printStackTrace();
      }
      return sr;
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }

      return str;
    }
  }
  static long gcd(long a,long b)
  {
    if(a==0)
      return b;
    return  gcd(b%a,a);
  }

  //  static int MOD=1000000000+7;
  static BigInteger combination(long n,long k)
  {

    long kk=Math.min(n-k,k);
    BigInteger N=BigInteger.valueOf(n);
    //BigInteger K=BigInteger.valueOf(kk);
    BigInteger num=new BigInteger("1");
    BigInteger den =new BigInteger("1");
    BigInteger one =new BigInteger("1");

    for(int i=1;i<=kk;++i)
    {
     // num*=n;
      num=num.multiply(N);
      N=N.subtract(one);
      den=den.multiply(BigInteger.valueOf(i));
    }
    return num.divide(den);
  }

  static long mod=1000000007;
  public static void main(String[] args) throws Exception {
    FastReader sc = new FastReader();
    int n=sc.nextInt();
    int m=sc.nextInt();
    long k=sc.nextLong();
    ArrayList<Long>a=new ArrayList<>();
    ArrayList<Long>b=new ArrayList<>();
   for(int i=0;i<n;++i)
   {
    a.add(sc.nextLong());
   }
    for(int i=0;i<m;++i)
    {
      b.add(sc.nextLong());
    }
    int ai=0,bi=0,ans=0;
    while(k>0&&(ai<n&&bi<m)&&(k>Math.min(a.get(ai),b.get(bi))))
    {
      if(a.get(ai)<b.get(bi))
      {
        k-=a.get(ai);
        ++ans;
        ++ai;
      }
      else
      {
        k-=b.get(bi);
        ++ans;
        ++bi;
      }
    }

    while(ai<n)
    {
      if(k>=a.get(ai))
      {
        k-=a.get(ai);
        ++ai;
        ++ans;
      }
      else
        break;
    }

    while(bi<m)
    {
      if(k>=b.get(bi))
      {
        k-=b.get(bi);
        ++bi;
        ++ans;
      }
      else
        break;
    }
    System.out.println(ans);

  }
}


// out.println(al.toString().replaceAll("[\\[|\\]|,]",""));
