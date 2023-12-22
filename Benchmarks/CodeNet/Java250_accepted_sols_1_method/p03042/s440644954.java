import java.util.Scanner;

public class Main {
	final static String YYMM = "YYMM";
	final static String MMYY = "MMYY";
	final static String AMBIGUOUS = "AMBIGUOUS";
	final static String NA = "NA";
	final static String patern = "uuMMdd";
	final static String day = "01";
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		sc.close();
		boolean yymm = false, mmyy =false;
		int a = S / 100;
		int b = S % 100;
		// YYMM
		if(b >= 1 && b <= 12) yymm = true;
		// MMYY
		if(a >= 1 && a <= 12) mmyy = true;
		if(yymm && mmyy) System.out.println(AMBIGUOUS);
		else if(yymm) System.out.println(YYMM);
		else if(mmyy) System.out.println(MMYY);
		else System.out.println(NA);
	}
}