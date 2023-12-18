
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {

static int mod=(int)1e9+7;
 public static void main(String[] $) {

   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
   
   
  
   int list[]=new int[n];
   list[0]=a[0];
   int len=1;
   for(int i=1;i<n;i++) {
    if(Math.abs(a[i]-list[len-1])<=k) {
      list[len]=a[i];
      len++;
    }else {
      int c = CeilIndex(list, 0, len - 1, a[i]);
      
      list[c] = a[i];
    }
   }
   
   System.out.println(len);
}
static int msb(int a){
   int k=(int)(Math.log(a)/Math.log(2));
   return k;
}
static int CeilIndex(int A[], int l, int r, int key) 
{ 
    while (r - l > 1) { 
        int m = l + (r - l) / 2; 
        if (A[m] >= key) 
            r = m; 
        else
            l = m; 
    } 

    return r; 
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