import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a = str.charAt(0);
        char b = str.charAt(3);
        boolean flag = false;
        if (a == str.charAt(1) && a == str.charAt(2)) {
            flag = true;
        }
        if (b == str.charAt(1) && b == str.charAt(2)) {
            flag = true;
        }
        System.out.println(flag ? "Yes" : "No");

    }
}