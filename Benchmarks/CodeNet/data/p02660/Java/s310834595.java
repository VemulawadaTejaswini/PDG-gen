import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        Long N = scanner.nextLong();

        if (N == 1){
            System.out.println(0);
            return;
        }

        boolean[][] index = new boolean[2][(int)Math.sqrt(N) + 1];

        for (int i = 2; i < index[0].length; i++) {

            if (!index[0][i]){

                long v = i*i;
                for (int j = i; j < index.length; j += i) {
                    if (j == v){
                        index[0][j] = true;
                        v = v * i;
                    } else {
                        index[0][j] = true;
                        index[1][j] = true;
                    }
                }
            }
        }

        long R = 0;
        long V = N;
        for (long i = 2; i*i <= N; i++){
            if (index[1][(int)i]) continue;

            if (V % i == 0){
                R++;
                V = V / i;
            }
        }

        if(R == 0) R = 1;

        System.out.println(R);
    }

    public static void main(String[] args) {
        new Main();
    }
}
