import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] W = new String[N + 1];
		W[0] = null;
		int count_a = 0;
		int count_b = 0;
		
		for(int i = 1; i < (N + 1); i++) {
			W[i]  = sc.next();
			if((i >= 2) && (W[i].charAt(0) == W[i - 1].charAt(W[i - 1].length() - 1))) {
				count_a++;
			}
		}
		
		for(int i = 2; i < (N + 1); i++) {
			for(int j = 1; j < i; j++) {
				if(W[i].equals(W[j])) {
					count_b++;
				}
			}
		}
		
		
		if((count_a == (N - 1)) && count_b == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}		
	}
}
