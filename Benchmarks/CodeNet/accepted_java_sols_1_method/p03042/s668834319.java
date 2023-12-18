import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        String s = sc.next();

        if (Integer.valueOf(s.substring(0, 2)) <= 12 && Integer.valueOf(s.substring(0, 2)) > 0) {
            if (Integer.valueOf(s.substring(2, 4)) <= 12 && Integer.valueOf(s.substring(2, 4)) > 0) {
                System.out.println("AMBIGUOUS");
            } else {
                System.out.println("MMYY");
            }
        } else if (Integer.valueOf(s.substring(2, 4)) <= 12 && Integer.valueOf(s.substring(2, 4)) > 0) {
            System.out.println("YYMM");
        } else {
            System.out.println("NA");
        }
        

		sc.close();
	}
}
