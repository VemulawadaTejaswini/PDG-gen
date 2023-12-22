import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();

        if (length == 2) {
            System.out.println(str);
        } else {
            System.out.println(new StringBuilder(str).reverse().toString());
        }
    }
}