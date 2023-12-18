import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[2][n];
        int candySum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int i, j;
        int max = 0;
      int t=n;
        for (; t >= 0; t--) {
            candySum = 0;
            for (i = 0; i < t; i++) {
                candySum += array[0][i];
            }
          if(i!=0) i-=1;
            for (j = i ; j < n; j++) {
                candySum += array[1][j];
             
            }
            if (candySum > max)
                max = candySum;
        }
        System.out.println(max);
    }
}
