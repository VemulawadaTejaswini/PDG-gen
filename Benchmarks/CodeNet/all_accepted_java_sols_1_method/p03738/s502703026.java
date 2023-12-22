import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.length() == b.length()) {
            if (a.compareTo(b) < 0) {
                System.out.println("LESS");
            } else if (a.compareTo(b) == 0) {
                System.out.println("EQUAL");
            } else {
                System.out.println("GREATER");
            }
        } else {
            System.out.println(a.length() < b.length() ? "LESS" : "GREATER");
        }
    }

}
