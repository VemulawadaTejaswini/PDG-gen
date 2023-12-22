import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();

        Map<Integer,Integer> squares = new HashMap<>();

        for (int i = 1; i <= 200; i++) {
            squares.putIfAbsent(i*i,i);
        }

        int[][] dp = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                dp[i][j] = scan.nextInt();
            }
        }

        int counter = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int x = 0;
                for (int k = 0; k < d; k++) {
                    x+=Math.pow(dp[i][k] - dp[j][k],2);
                }
                if(squares.containsKey(x)){
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}