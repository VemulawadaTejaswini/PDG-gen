import java.util.Scanner;

public class Main {

	static int gcd(int a, int b){

		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(stdIn.hasNext()){
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int gcd_ans = gcd(a,b);
			int lcm_ans = a/gcd_ans*b;

			System.out.println(gcd_ans+" "+lcm_ans);
		}
	}
}