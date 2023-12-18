import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long limit = 1000000000000000000L;
        long n = Integer.parseInt(sc.next());
        long ans = 1;
        while (sc.hasNext()) {
            ans *= Integer.parseInt(sc.next());
            if (ans > limit) {
                ans = 0;
                break;
            }
        }
        System.out.println(ans);

        sc.close();
    }

}
