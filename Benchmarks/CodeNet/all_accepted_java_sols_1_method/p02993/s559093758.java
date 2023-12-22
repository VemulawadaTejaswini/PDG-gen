import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "Good";
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                res = "Bad";
                break;
            }
        }
        System.out.println(res);
    }
}