import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		boolean isYYMM = false;
		boolean isMMYY = false;

		int fh =  Integer.parseInt(s.substring(0, 2));
		int lh =  Integer.parseInt(s.substring(2));

		if (0 < lh && lh <= 12) {
			isYYMM = true;
		}

		if (0 < fh && fh <= 12) {
			isMMYY = true;
		}

		String ans = isYYMM ? isMMYY ? "AMBIGUOUS" : "YYMM"
				: isMMYY ? "MMYY" : "NA" ;
		System.out.println(ans);
		sc.close();
	}

}
