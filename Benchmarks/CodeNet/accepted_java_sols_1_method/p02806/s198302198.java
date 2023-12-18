import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        int [] t = new int[n];
        for (int i = 0 ; i < n ; i++) {
            s[i] = sc.next();
            t[i] = sc.nextInt();
        }
        String x = sc.next();

        boolean flg = false;
        int sum = 0;
        for (int i = 0 ; i < n ; i++) {
            if (flg) {
                sum += t[i];
            }
            if (s[i].equals(x)) {
                flg = true;
            }

        }

        System.out.println(sum);

    }

}