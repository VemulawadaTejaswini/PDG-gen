import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s =sc.nextLine().toCharArray();
		sc.close();

		int upper = (s[0] - '0')*10 + (s[1] - '0');
		int lower = (s[2] - '0')*10 + (s[3] - '0');
		boolean upperMonthCandidate = (1 <= upper && upper <= 12);
		boolean lowerMonthCandidate = (1 <= lower && lower <= 12);
		if (upperMonthCandidate && lowerMonthCandidate) {
			System.out.println("AMBIGUOUS");
		} else if (upperMonthCandidate && ! lowerMonthCandidate) {
			System.out.println("MMYY");
		} else if (! upperMonthCandidate && lowerMonthCandidate){
			System.out.println("YYMM");
		} else {
			System.out.println("NA");
		}
	}
}
