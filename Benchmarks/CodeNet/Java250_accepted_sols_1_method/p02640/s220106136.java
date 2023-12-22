import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int x = scn.nextInt();
			int y = scn.nextInt();
			boolean isOk = false;
			for(int t=0; t<=x; t++) {
				int k=x-t;
				if((t*2 + k*4) == y) {
					isOk = true;
					break;
				}
			}
			System.out.println(isOk ? "Yes" : "No");
		}
	}
}
