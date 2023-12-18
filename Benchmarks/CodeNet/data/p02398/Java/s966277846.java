import java.util.Scanner;

/**
 * Created by labuser on 2016/04/20.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();

    }

    private void run() {

        int a, b, c;

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);
        c = Integer.parseInt(input[2]);
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (c % i == 0) cnt++;
        }
        System.out.println(cnt);
    }
}