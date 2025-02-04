import java.util.Scanner;

/**
 * Created by nakatsukatakahiro on 2017/06/10.
 */
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = Integer.parseInt(scanner.next());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(scanner.next());
            if (tmp > max) {
                max = tmp;
            }
            if (tmp < min) {
                min = tmp;
            }
        }
        System.out.println(max - min);
    }
}
