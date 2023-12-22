import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String A = sc.next();
            String B = sc.next();

            if ( A.equals(B) ) {
                System.out.println("EQUAL");
            } else if ( A.length() < B.length() || A.length() == B.length() && A.compareTo(B) < 0 ) {
                System.out.println("LESS");
            } else {
                System.out.println("GREATER");
            }
        }
    }
}
