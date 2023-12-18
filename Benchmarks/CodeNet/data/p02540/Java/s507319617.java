import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];
        boolean[][] answer = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            for (int j = 0; j < n; j++) {
                answer[i][j] = (i == j);
            }
        }

        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (answer[i][j]) continue;
                if((x[j] < x[i] && y[j] < y[i]) || (x[j] > x[i] && y[j] > y[i]))
                    if(j < i) counter += fillWithTrue(i, j, n, answer);
                    else {
                        answer[i][j] = true;
                        counter++;
                    }
            }
            System.out.println(counter);
            counter = 1;
        }
    }

    private static int fillWithTrue(int current, int target, int n, boolean[][] answer) {
        int counter = 0;
        for (int j = 0; j < n; j++) {
            if (answer[target][j] && !answer[current][j]) {
                answer[current][j] = true;
                counter++;
            }
        }
        return counter;
    }