import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int L = s.nextInt();

		int ajiMin = 9999;
		int ajiSum = 0;
		for (int i = 1; i <= N; i++) {
			int aji = L + i - 1;
			ajiSum += aji;

			if(Math.abs(aji) < Math.abs(ajiMin)) {
				ajiMin = aji;
			}
		}
		System.out.println(ajiSum - ajiMin);

	}

}
