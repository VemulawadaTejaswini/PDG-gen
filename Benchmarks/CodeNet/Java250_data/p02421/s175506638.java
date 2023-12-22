import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = scan.nextInt();
		int tarop = 0;
		int hanap = 0;

		loop:
		for (int i = 0; i < n; i++) {
			String taroCard = scan.next();
			String hanaCard = scan.next();

			char[] taroAr = taroCard.toCharArray();
			char[] hanaAr = hanaCard.toCharArray();

			int taroL = taroAr.length;
			int hanaL = hanaAr.length;

			for ( int j = 0; j < Math.min(taroL, hanaL); j++) {
				if (taroAr[j] > hanaAr[j]) {
					tarop += 3;
					continue loop;
				} else if (taroAr[j] < hanaAr[j]) {
					hanap += 3;
					continue loop;
				}
			}

			if (taroL > hanaL) {
				tarop += 3;
				continue loop;
			} else if ( taroL < hanaL) {
				hanap += 3;
				continue loop;
			} else {
				tarop += 1;
				hanap += 1;
			}
		}
		System.out.println(tarop + " " + hanap);
	}

}