import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		int lcm=sc.nextInt();
		for(int i=2;i<=n;i++){
			int a_i=sc.nextInt();
			lcm=getLCM(lcm,a_i);
		}
		System.out.println(lcm);
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
	static int getLCM(int a,int b){
		return a/getGCD(a,b)*b;
	}
}