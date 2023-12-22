import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[]{sc.next(), sc.next()};
        System.out.println((s[0] + s[0]).contains(s[1]) ? "Yes" : "No");
    }
}