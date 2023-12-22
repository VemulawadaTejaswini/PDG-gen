import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		char[] taro;
		char[] hana;

		int tp = 0;
		int hp = 0;

		loop:
		for ( int i=0; i<n; i++ ) {
			taro = sc.next().toCharArray();
			hana = sc.next().toCharArray();

			int tl = taro.length;
			int hl = hana.length;
			int len = Math.min(tl, hl);

			for (int j=0; j<len; j++) {
				if ( taro[j] - hana[j] > 0 ) {
					tp += 3;
					continue loop;
				} else if ( taro[j] - hana[j] < 0 ) {
					hp += 3;
					continue loop;
				}
			}

			if ( tl == hl ) {
				tp += 1;
				hp += 1;
				continue loop;
			} else if ( tl > hl ) {
				tp += 3;
				continue loop;
			} else if ( tl < hl ) {
				hp += 3;
				continue loop;
			}
		}

		System.out.println(tp + " " + hp);
	}

}