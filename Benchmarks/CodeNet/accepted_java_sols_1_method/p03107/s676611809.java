import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.next().toCharArray();
        int a = 0;
        int b = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i] == '0')
                a++;
            else if (s[i] == '1')
                b++;
        }

        System.out.println(Math.min(a, b) * 2);
    }
}