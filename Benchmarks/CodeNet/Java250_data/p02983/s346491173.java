import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long L = (long) Integer.parseInt(sc.next());
		Long R = (long) Integer.parseInt(sc.next());
		sc.close();
		long a = L / 2019;
		long b = R / 2019;
		long base = 2019;
		if(a != b) {
			System.out.println(0);
		}else {
			for(long i = L; i < R; i++) {
				for(long j = L + 1; j <= R; j++) {
					long c = i % 2019;
					long d = j % 2019;
					long check = c * d;
					long checkValue = check % 2019;
					if(checkValue <= base) {
						base = checkValue;
					}
				}
			}
			System.out.println(base);
		}
	}
}