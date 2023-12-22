import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1, s2;
		s1 = s2 = "";
		for(int i = 0; i < 2; i++) {
			s1 += s.charAt(i);
			s2 += s.charAt(i + 2);
		}

		int a = Integer.valueOf(s1);
		int b = Integer.valueOf(s2);

		if(a < 13 && b < 13 && a > 0 && b > 0) System.out.println("AMBIGUOUS");
		else if(a < 13 && a > 0) System.out.println("MMYY");
		else if(b < 13 && b > 0) System.out.println("YYMM");
		else System.out.println("NA");

		sc.close();
	}
}
