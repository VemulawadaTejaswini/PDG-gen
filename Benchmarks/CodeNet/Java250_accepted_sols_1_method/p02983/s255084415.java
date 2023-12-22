import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long lNum = s.nextInt();
		long rNum = s.nextInt();
		s.close();
		long min = 2019;
		if (lNum / 2019 == rNum / 2019) {
			for (long i = lNum; i < rNum; i++) {
				for (long j = i + 1; j <= rNum; j++) {
					long amari = (i * j) % 2019;
					if (amari < min) {
						min = amari;
					}
					if(amari == 0) {
						min = 0;
						break;
					}
				}
			}
		}else {
			min = 0;
		}
		System.out.println(min);

	}

}
