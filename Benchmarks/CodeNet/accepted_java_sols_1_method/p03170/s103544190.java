
import java.util.*;


public class Main{ 


    public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int k=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	int dp[]=new int[k+1];
	for(int i=1;i<=k;i++) {
		for(int j=0;j<n;j++) {
			if(i<arr[j]) {
				continue;
			}
			if(dp[i-arr[j]]==0) {
				dp[i]=1;
				break;
			}
		}
	}
	if(dp[k]==1)
		System.out.print("First");
	else
		System.out.println("Second");
	 
	 
   }
}