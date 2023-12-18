import java.util.Scanner;

public class Main {

	static int gcd(int a, int b){
		c = 0;
		if(a < b){
			int tmp = a;
			a = b;
			b = tmp;
		}
		while(b!=0){
			int r = a%b;
			a = b;
			b = r;
			c++;
		}
		return a;
	}

	static int c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if((a|b)==0)break;
			System.out.println(gcd(a,b)+" "+c);
		}
	}
}