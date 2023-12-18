import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			HashSet<Integer> S = new HashSet<Integer>();
			int q = sc.nextInt();
			for(int i = 0; i < q; i++) {
				int cmd = sc.nextInt();
				int x = sc.nextInt();
				if(cmd == 0) {
					S.add(x);
					System.out.println(S.size());
				}
				else {
					System.out.println(S.contains(x) ? "1" : "0");
				}
			}
		}
	}
}
