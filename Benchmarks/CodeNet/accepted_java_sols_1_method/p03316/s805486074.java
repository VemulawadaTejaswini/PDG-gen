import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        long S = 0;

        for (int i = 0; i < N.length(); i++) {
            S += N.charAt(i) - '0';
        }
        if (Integer.valueOf(N) % S == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


