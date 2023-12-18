import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] name = new long[5];
		long N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			switch(sc.next().charAt(0)) {
			case 'M':
				name[0] += 1;
				break;
			case 'A':
				name[1] += 1;
				break;
			case 'R':
				name[2] += 1;
				break;
			case 'C':
				name[3] += 1;
				break;
			case 'H':
				name[4] += 1;
				break;
			}
		}

		long result = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = i + 1; j < 4; j++) {
				for(int k = j + 1; k < 5; k++) {
					result += name[i] * name[j] * name[k];
				}
			}
		}
		System.out.println(result);
		sc.close();
	}
}
