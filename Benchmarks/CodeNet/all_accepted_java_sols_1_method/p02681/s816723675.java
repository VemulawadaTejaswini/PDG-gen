import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        String T2 = new StringBuilder(T).deleteCharAt(T.length()-1).toString();
        if (S.equals(T2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}