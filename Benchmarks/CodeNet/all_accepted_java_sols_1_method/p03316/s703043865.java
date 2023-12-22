import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            n += s.charAt(i) - '0';
        }
        System.out.println(Integer.parseInt(s) % n == 0 ? "Yes" : "No");
    }
}