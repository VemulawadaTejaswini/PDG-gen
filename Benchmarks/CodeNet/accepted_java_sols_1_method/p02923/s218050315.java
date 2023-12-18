import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = s.nextInt();
        }

        int max = 0, count = 0;

        for (int i = 1; i < N; i++) {
            if (H[i-1] >= H[i]) {
                count++;
            }
            else {
                if(max < count) max = count;
                count = 0;
            }
        }
        if(max < count) max = count;

        System.out.println(max);
        s.close();
    }
}