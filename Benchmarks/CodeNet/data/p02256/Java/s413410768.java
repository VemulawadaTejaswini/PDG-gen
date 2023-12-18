import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,gcd=2;
		a=scan.nextInt();
		b=scan.nextInt();
		if(a>=b){
			GCD(a,b);
		}
		else{
			GCD(b,a);
		}
	}
	public static void GCD(int a,int b){
		if(a>0 && b>0){
			a=a%b;
			GCD(b,a);
		}
		else {
			System.out.println(a);
			return;
		}
	}
}
