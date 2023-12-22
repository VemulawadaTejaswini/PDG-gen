import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '0') {
                a++;
            } else {
                b++;
            }
        }
        System.out.println(Math.min(a, b) * 2);
    }
}