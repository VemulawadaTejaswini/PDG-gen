import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		while(true){
			int n=sc.nextInt();
			int x=sc.nextInt();
			if(n==0&&x==0) break;
			System.out.println(challenge(n,x));
		}
	}
	private static int challenge(int n,int x){
		int ways=0;
		for(int i=1;i<=n;i++){
			for(int j=i+1;j<=n;j++){
				for(int k=j+1;k<=n;k++){
					if(x==i+j+k) ways++;
				}
			}
		}
		return ways;
	}
}