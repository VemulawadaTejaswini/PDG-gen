import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] w = new String[n];
		String ans;
		for(int i = 0; i < n; i++) {
			w[i] = sc.next();
		}
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(w[i].equals(w[j])) {
					System.out.println("No");
					return;
				}
			}
		}
		for(int i = 1; i < n; i++) {
			if(w[i-1].charAt(w[i-1].length()-1)!=w[i].charAt(0)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
