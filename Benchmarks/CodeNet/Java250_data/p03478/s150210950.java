import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int sum = 0;
        for (int i = 1; i < N + 1; i++) {
            String[] val = String.valueOf(i).split("");

            int tmp = 0;
            for (String c : val) {
                tmp += Integer.parseInt(c);
            }

            if (A <= tmp && tmp <= B) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
