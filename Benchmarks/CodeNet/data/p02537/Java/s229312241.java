
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main{

static int mod=(int)1e9+7;
 public static void main(String[] $) {

   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
   int list[]=new int[n];
   for(int i=0;i<n;i++) {
     list[i]=1;
     for(int j=0;j<i;j++) {
       if(Math.abs(a[j]-a[i])<=k) {
         list[i]=Math.max(list[i],list[j]+1);
       }
     }
   }
   int res=0;
   for(int i=0;i<n;i++) {
     res=Math.max(res,list[i]);
   }
   System.out.println(res);
}
static int msb(int a){
   int k=(int)(Math.log(a)/Math.log(2));
   return k;
}


static long pow(long x,long y) {
  long res=1l;
  while(y!=0) {
    if(y%2==1) {
      res=x*res%mod;
    }
    y/=2;
    x=x*x%mod;
  }
  return res;
}

}
class pair{
  int x,y;
  pair(int x,int y){
    this.x=x;
    this.y=y;
  }
}