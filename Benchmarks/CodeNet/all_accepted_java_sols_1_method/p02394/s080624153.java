import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] st = s.split(" ");
		int[] in = new int[5];
		for (int i = 0; i < 5; i++) {
			in[i] = Integer.parseInt(st[i]);
		}
		
		if (0 <= in[2]-in[4] && in[2]+in[4] <= in[0] && 0 <= in[3]-in[4] && in[3]+in[4] <= in[1]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");

		}

	}

}