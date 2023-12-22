import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String s = sc.next();

        int tmp = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                tmp++;
                max = Math.max(max, tmp);
            } else {
                tmp--;
            }
        }
        System.out.println(max);
    }
}