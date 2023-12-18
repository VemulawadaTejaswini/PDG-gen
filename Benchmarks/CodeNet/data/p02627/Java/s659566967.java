import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        if (Character.isUpperCase(X.charAt(0))) {
            System.out.println('A');
        } else {
            System.out.println('a');
        }
        sc.close();
    }
}
