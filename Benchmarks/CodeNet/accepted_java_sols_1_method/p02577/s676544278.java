import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        long sum = 0;
        for (int i = 0; i < s.length; i++) {
            int x = Integer.parseInt(s[i]);
            sum += x;
        }
        if (sum % 9 == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}