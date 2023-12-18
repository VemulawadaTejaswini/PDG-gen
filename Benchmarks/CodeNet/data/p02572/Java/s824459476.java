import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        long[] a =  new long[n];
        long mod = 1000000007;
      	for(int i=0;i<n;i++){
      		a[i]=sc.nextLong()%mod;
      	}
      	long sum=0;
      	for(int i=0;i<n;i++){
      		sum=(sum+a[i])%mod;
      	}
      long ans=0;
      long sum2=0;
      for(int i=0;i<n;i++){
    	  sum2=(sum2+a[i]*a[i])%mod;
      }
      ans=(sum*sum-sum2);
      while(ans<0){
    	  ans=ans+mod;
      }
      if(ans%2==1){ans=ans+mod;}
      ans=ans/2;
      ans=ans%mod;
      System.out.println(""+ans);
	}
}