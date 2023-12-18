import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(gcd(a,b)+" "+lcm(a,b));
		}
	}

	private static int gcd(int a,int b){
		int max=Math.max(a, b);
		int min=Math.min(a, b);

		int amari=max%min;
		if(amari==0)return min;
		return gcd(min,amari);
	}

	private static int lcm(int a,int b){
		return a*b/gcd(a,b);
	}
}