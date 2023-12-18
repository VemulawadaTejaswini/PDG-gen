import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        boolean isALarger = false;
        boolean isEqual = true;

        if (A.length() > B.length()) {
            isALarger = true;
            isEqual = false;
        } else if (A.length() < B.length()) {
            isALarger = false;
            isEqual = false;
        } else {
            int n = A.length();
            for (int i = 0; i < n; i++) {
                if (A.charAt(i) == B.charAt(i)) {
                    continue;
                }
                isALarger = A.charAt(i) > B.charAt(i);
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            System.out.println("EQUAL");
        } else if (isALarger) {
            System.out.println("GREATER");
        } else {
            System.out.println("LESS");
        }
    }

}
