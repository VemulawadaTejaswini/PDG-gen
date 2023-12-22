import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt(), b = in.nextInt();
		
		int max = Math.max(a, b);
		
		int k = 0;
		
		for(int i = 1;i<=max;i++) {
			if(Math.abs(a-i) == Math.abs(b-i)) {
				k = i;
			}
		}
		
		if(k == 0) {
			System.out.println("IMPOSSIBLE");
		}
		else {
			System.out.println(k);
		}

	}

}
