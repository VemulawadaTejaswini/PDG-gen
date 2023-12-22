import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());

        int[][] x = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] =  Integer.parseInt(sc.next());
            }
        }

        double diff = 0;
        double sqrtDist = 0;
        double dist = 0;
        boolean flg = false;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                dist = 0;
                for (int k = 0; k < d; k++){
                    diff = x[i][k] - x[j][k];
                    dist += diff * diff;
                }

                sqrtDist = (int)Math.sqrt(dist) + 1;
                for (int k = 0; k < sqrtDist; k++) {
                    if (k * k == dist) {
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}