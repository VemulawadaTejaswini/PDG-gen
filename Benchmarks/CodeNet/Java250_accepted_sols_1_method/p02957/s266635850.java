import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		if(a >= b) {
			c = a;
		}else {
			c = b;
		}
		int k = 0;
		
		for(int i = 0; i < c; i++) {
			if(Math.abs(a - i) == Math.abs(b - i)){
				k = i;
			}
		}
		if(k == 0) {
			System.out.println("IMPOSSIBLE");
		}else {
			System.out.println(k);
		}
	}
}