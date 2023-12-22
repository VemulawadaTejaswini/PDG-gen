import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.length() != b.length()) {
            if (a.length() > b.length()) {
                System.out.println("GREATER");
            } else {
                System.out.println("LESS");
            }
        } else {
            for (int i = 0; i < a.length(); i++) {
                int aa = Character.getNumericValue(a.charAt(i));
                int bb = Character.getNumericValue(b.charAt(i));
                if (aa > bb) {
                    System.out.println("GREATER");
                    return;
                } else if (aa < bb) {
                    System.out.println("LESS");
                    return;
                }
            }
            System.out.println("EQUAL");
        }
    }
}