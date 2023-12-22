import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;

        for (int i = a; i <= b; i++) {
            String s = String.valueOf(i);
            if (s.charAt(0) == s.charAt(4) && s.charAt(1) == s.charAt(3)) {
                c++;
            }
        }
        System.out.print(c);
    }
}
