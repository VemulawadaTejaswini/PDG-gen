import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextChar();
        if (Character.isLowerCase(ch)) {
            System.out.println('a');
        } else {
            System.out.println('A');
        }
    }
}