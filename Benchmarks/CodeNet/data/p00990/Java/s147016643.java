import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static int n,m,sum;
	static int cnt1=0,cnt2=0;
	static int[]id;
	static int[]num;
	static HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();
	static int[][] dp;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		n=cin.nextInt();
		id=new int[n];
		
		char[] sss=cin.next().toCharArray();
		for(int i=0;i<sss.length;i++){
			if(sss[i]=='*'){
				if(i%2==0){
					cnt1++;
				}
				else{
					cnt2++;
				}
			}
			else{
				int b=sss[i]-'0';
				if(i%2==0){
					sum=sum+b;
				}
				else{
					int a=b*2;
					if(a>=10){
						sum+=a%10;
						sum+=a/10;
					}
					else{
						sum+=a;
					}	
				}
				sum=sum%10;
			}
		}
//		System.out.println(cnt1+" "+cnt2+" "+sum);
		dp=new int[cnt1+cnt2][100];
		for(int i=0;i<cnt1+cnt2;i++){
			Arrays.fill(dp[i],-1);
		}
		m=cin.nextInt();
		num=new int[m];
		for(int i=0;i<m;i++){
			num[i]=cin.nextInt();
		}
		System.out.println(bt(0,sum));
	}
	static int bt(int cnt,int sum){
		if(cnt==cnt1+cnt2){
//			System.out.println(cnt+" "+sum);
			if((sum%10)==0){
				return 1;
			}
			else{
				return 0;
			}
		}
		if(dp[cnt][sum]!=-1){
//			System.out.println(dp[cnt][sum]);
			return dp[cnt][sum];
		}
		dp[cnt][sum]=0;
		int re=0,orgSum=sum;
		for(int i=0;i<num.length;i++){
			int add=0;
			if(cnt>=cnt1){
				int a=num[i]*2;
				if(a>=10){
					add+=a%10;
					add+=a/10;
				}
				else{
					add+=a;
				}
			}
			else{
				add=num[i];
			}
			dp[cnt][orgSum]+=bt(cnt+1,(sum+add)%10);
		}
		return dp[cnt][orgSum];
	}
	static boolean isTrue(){
		int sum=0;
		for(int i=0;i<id.length;i++){
			if(i%2==0){
				sum+=id[i];
			}
			else{
				int a=id[i]*2;
				if(a>=10){
					sum+=a%10;
					sum+=a/10;
				}
				else{
					sum+=a;
				}
			}
		}
		return (sum%10)==0;
	}
}