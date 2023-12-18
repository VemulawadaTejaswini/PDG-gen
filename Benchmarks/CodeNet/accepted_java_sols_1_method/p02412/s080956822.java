import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			if (n == 0 && x == 0) {
				break;
			}
			int count = 0;
			for (int i1 = 1; i1 <= n-2; i1++) {
				for (int i2 = i1+1; i2 <= n-1; i2++){
					for (int i3 = i2+1; i3 <= n; i3++) {
						if (i1 + i2 + i3 == x) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}

}