import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int[] prime=new int[50001];
		boolean[] primeflag=new boolean[50001];
		Scanner sc=new Scanner(System.in);
		prime[0]=2;
		prime[1]=3;
		int ptr=2;
		for(int i=5;i<=50000;i++){
			boolean flag=true;
			for(int j=0;prime[j]<=Math.sqrt(i);j++){
				if(i%prime[j]==0){
					flag=false;
				}
			}
			if(flag){
				prime[ptr++]=i;
				primeflag[i]=true;
			}
		}
		int n=sc.nextInt();
		while(n!=0){
			int count=0;
			for(int i=0;prime[i]<=n/2;i++){
				if(primeflag[n-prime[i]]){
					count++;
				}
			}
			System.out.println(count);
			n=sc.nextInt();
		}
	}
}