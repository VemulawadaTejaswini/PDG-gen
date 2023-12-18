import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = Integer.parseInt(sc.next());
			int x = Integer.parseInt(sc.next());
			if (n == 0 && x == 0) break;
			int count = 0;
			for (int i=1; i < n+1; i++) {
				for (int j=i+1; j < n+1; j++) {
					for (int k=j+1; k < n+1; k++) {
						if (i + j + k == x) count++;
					}
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}