import java.util.Scanner;

public class Main {

	public static long N;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		N = scan.nextLong();
		String S = judge(N % 26);
		N /= 26;
		int i = 1;

		while (N != 0) {
			S = judge(N % 26) + S;
			N /= 26;

		}

		System.out.println(S);
	}

	public static String judge(long x) {

		switch ((int)x) {
		case 1:
			return "a";
		case 2:
			return "b";
		case 3:
			return "c";
		case 4:
			return "d";
		case 5:
			return "e";
		case 6:
			return "f";
		case 7:
			return "g";
		case 8:
			return "h";
		case 9:
			return "i";
		case 10:
			return "j";
		case 11:
			return "k";
		case 12:
			return "l";
		case 13:
			return "m";
		case 14:
			return "n";
		case 15:
			return "o";
		case 16:
			return "p";
		case 17:
			return "q";
		case 18:
			return "r";
		case 19:
			return "s";
		case 20:
			return "t";
		case 21:
			return "u";
		case 22:
			return "v";
		case 23:
			return "w";
		case 24:
			return "x";
		case 25:
			return "y";
		case 0:
			 N -= 1;
			return "z";
		}

		return "";
	}

}