import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        String s = sc.next();
        int l = s.length();

        for (int i = 1; i < l; i++) {
            if (s.substring(0,(l-i)/2).equals(s.substring((l-i)/2, l-i))) {
                System.out.println(l-i);
                break;
            }
        }

		sc.close();
	}
}
