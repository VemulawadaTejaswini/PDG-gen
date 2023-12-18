import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char r[], a[];
		int hit, blow;

		while (true) {
			r = sc.next().toCharArray();
			a = sc.next().toCharArray();
			if (r.length == 1 && a.length == 1 && r[0] == '0' && a[0] == '0') {
				break;
			}
			hit = blow = 0;
			for (int i = 0; i < 4; i++) {
				if (r[i] == a[i]) {
					hit++;
				}
			}
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (i != j && a[i] == r[j]) {
						blow++;
					}
				}
			}
			System.out.println(hit + " " + blow);
		}
	}
}