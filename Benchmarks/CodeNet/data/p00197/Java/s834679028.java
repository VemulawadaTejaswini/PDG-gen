import java.util.Scanner;

public class Main {
	
	static int count = 0;
	
	static int gcd(int a,int b){
		count++;
		int r = a%b;
		if(r == 0) {
			return b;
		}else {
			return gcd(b,r);
		}
	}


	void main() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a + b == 0) break;
			if(a<b) {
				int temp = a;
				a = b;
				b = temp;
			}
			int ans = gcd(a,b);
			System.out.println(ans +" " + count);
			count = 0;
		}
		
	}

	public static void main(String[] args) {
		new Main().main();
	}

}

