import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int r_counter = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'R') {
                r_counter++;
            }
        }
        int res_counter = 0;
        for (int i = 0; i < r_counter; i++) {
            if (S.charAt(i) != 'R') {
                res_counter++;
            }
        }
        System.out.println(res_counter);
        sc.close();
    }
}