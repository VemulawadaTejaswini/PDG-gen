import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		boolean l = 1 <= S / 100 && S / 100 <= 12, r = 1 <= S % 100 && S % 100 <= 12;
		if (l && r) System.out.println("AMBIGUOUS");
		else if (l && !r) System.out.println("MMYY");
		else if (!l && r) System.out.println("YYMM");
		else System.out.println("NA");
	}
}