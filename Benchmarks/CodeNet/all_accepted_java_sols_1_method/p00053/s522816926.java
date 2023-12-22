import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int[] prime = new int[130000];
		for (int i = 0; i < prime.length; i++) {
			prime[i] = 1;
		}
		
		for (int i = 2; i < (prime.length / 2); i++) {
			for (int j = 2; (i * j) < prime.length; j++) {
				prime[i * j] = 0;
			}
		}
		prime[0] = 0;
		prime[1] = 0;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == 1) al.add(i);
		}
		
		int lines = Integer.parseInt(sc.nextLine());
		while (lines != 0) {
			int s = 0;
			for (int i = 0; i < lines; i++) {
				s = s + al.get(i);
			}
			
			System.out.println(s);
			
			lines = Integer.parseInt(sc.nextLine());
		}
	}
}