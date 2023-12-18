
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
   
   int dp[]=new int[n+1];
   Arrays.fill(dp, -1);

   System.out.println(solve(dp,a,n,a[n-1],k));
 }
 public static int l(int[] nums, int K) {
   if ( nums == null ) return 0;
   if ( nums.length <= 1 ) return nums.length;
   List<Integer> list = new ArrayList<Integer>(nums.length);
   list.add( 0, nums[0] );
   for ( int i = 1; i < nums.length; i++ ) {
       if ( nums[i] - list.get( list.size() - 1 ) <= K ) {
           list.add( nums[i] );
       } else  {
           int index = Collections.binarySearch( list, nums[i] );
           if ( index >= 0 && index < nums.length ) {
               list.set( index, nums[i] );
           } else {
               if ( -index - 1 > list.size() - 1 ) {
                   if ( nums[i] - list.get(list.size()-1) <= K ) {
                       list.add(nums[i]);
                   }
               } else {
                    if ( -index - 1 == 0 ) {
                       list.set(-index-1, nums[i]);
                   } else if ( nums[i] - list.get(-index-2) <= K ) {
                       list.set(-index-1, nums[i]);
                   }
               }
           }
       }
   }
   return list.size();
}

static int solve(int dp[],int a[],int n,int prev,int k) {
  if(n==0) {
    return 0;
  }
  if(dp[n]!=-1) {
    return dp[n];
  }
  if(Math.abs(a[n-1]-prev)<=k) {
    return dp[n]=Math.max(1+solve(dp,a,n-1,a[n-1],k),solve(dp,a,n-1,prev,k));
  }else {
    return dp[n]=solve(dp,a,n-1,prev,k);
  }
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