import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int max = -1;
        int min = -1;

        for (int i = 0; i < num; i++) {
            int tmp = in.nextInt();
            max = max < 0 ? tmp
                    : max < tmp ? tmp
                    : max;
            min = min < 0 ? tmp
                    : min > tmp ? tmp
                    : min;
        }
        int ans = max - min;
        System.out.println(ans);
    }
}
