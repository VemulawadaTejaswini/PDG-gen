import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        for (int i = 0 ; i < s.length ; i++) {
            if (s[i] != t[i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}