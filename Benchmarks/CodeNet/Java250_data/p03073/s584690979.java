import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.next().toCharArray();
        
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length; i++) {
            char c = s[i];
            if (i % 2 == 0) {
                if (c == '0')
                    a++;
                else
                    b++;
            } else {
                if (c == '1')
                    a++;
                else
                    b++;
            }
        }
        
        System.out.println(Math.min(a, b));
    }
}
