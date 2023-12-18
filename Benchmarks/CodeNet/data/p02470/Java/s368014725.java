import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(phi(n));
	}
	static int phi(int n){
		int ans=0;
		for(int i=1;i<n;i++){
			if(getGCD(i,n)==1)ans++;
		}
		return ans;
	}
	
	static int getGCD(int a,int b){
		if(b>a){
			int tmp=a;
			a=b;
			b=tmp;
		}
		while(b!=0){
			int tmp=b;
			b=a%b;
			a=tmp;
		}
		return a;
	}
}