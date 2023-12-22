import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int game = sc.nextInt();

		int tarouPoint = 0;
		int hanakoPoint = 0;

		String tarou;
		String hanako;


		for (int j = 0; j < game; j++) {
			tarou = sc.next();
			hanako = sc.next();

			if (tarou.equals(hanako)) {
				tarouPoint++;
				hanakoPoint++;
				continue;
			}

			char[] tarouChar = tarou.toCharArray();
			char[] hanakoChar = hanako.toCharArray();

			int wordLength = (Math.min(tarouChar.length, hanakoChar.length));

			boolean equal = true;
			for (int i = 0; i < wordLength; i++) {
				if (tarouChar[i] > hanakoChar[i]) {
					tarouPoint += 3;
					equal = false;
					break;
				} else if (tarouChar[i] < hanakoChar[i]) {
					hanakoPoint += 3;
					equal = false;
					break;
				}
			}
			if (equal) {
				if (tarouChar.length > hanakoChar.length) {
					tarouPoint += 3;
				} else {
					hanakoPoint += 3;
				}
			}


		}
		System.out.println(tarouPoint +" "+ hanakoPoint);
	}
}
