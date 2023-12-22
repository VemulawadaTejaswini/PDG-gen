import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String strT = sc.nextLine();
        int[] T = Arrays.stream(strT.split(" ")).mapToInt(Integer::valueOf).toArray();
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int time = 0;
            int P = sc.nextInt() - 1;
            int X = sc.nextInt();
            for (int j = 0; j < N; j++) {
                if (j != P) {
                    time += T[j];
                } else {
                    time += X;
                }
            }
            System.out.println(time);
        }
    }

}
