import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        int count = 0;
        char c = S.charAt(0);

        for (int i = 1; i < N; i++) {
            if (S.charAt(i) != c) {
                count++;
                c = S.charAt(i);
            }
        }

        System.out.println(count + 1);


    }
}
