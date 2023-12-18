import java.util.*;
public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();

        int [] score = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            sum += score[i];
        }
        sc.close();

        double border = (double)sum / (double)(4 * M);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if(score[i] >= border){
                cnt++;
                if(cnt >= M){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}