import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] b = {0, 0, 0, 0, 0};

		for(int i = 0; i < n; i++) {
			String str = sc.next();
			switch(str.charAt(0)) {
			case 'M': b[0]++; break;
			case 'A': b[1]++; break;
			case 'R': b[2]++; break;
			case 'C': b[3]++; break;
			case 'H': b[4]++; break;
			}
		}

		long a = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 4; j++) {
				for (int k = j + 1; k < 5; k++) {
					a += b[i] * b[j] * b[k];
				}
			}
		}
		System.out.println(a);
	}
}
