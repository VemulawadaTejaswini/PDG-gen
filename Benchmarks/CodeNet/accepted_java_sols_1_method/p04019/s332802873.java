import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int[] dircon = new int[4];
		boolean flg = true;
		for (int i = 0; i < A.length(); i++) {
			char dir = A.charAt(i);

			switch(dir) {
			case 'S':
				dircon[0]++;
				break;
			case 'N':
				dircon[1]++;
				break;
			case 'E':
				dircon[2]++;
				break;
			case 'W':
				dircon[3]++;
				break;
			default:
				break;
			}
		}

		if (dircon[0] > 0 && dircon[1] == 0 ) {
			flg=false;
		}

		if (dircon[1] > 0 && dircon[0] == 0 ) {
			flg=false;
		}

		if (dircon[2] > 0 && dircon[3] == 0 ) {
			flg=false;
		}

		if (dircon[3] > 0 && dircon[2] == 0 ) {
			flg=false;
		}

		if (flg) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
