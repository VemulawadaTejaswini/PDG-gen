import java.util.*;

public class Main {

    public static void main(String[] args) {
        long days = 500000000000000L;
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = sc.nextLong();
        long temp = 0;

        for (int i = 0; i<S.length(); i++) {
            long target = S.charAt(i) - '0';
            //System.out.println(target);

            temp += Math.pow(target, days);

            if (temp >= K) {
                System.out.println(target);
              	return;
            }
        }
    }
}
