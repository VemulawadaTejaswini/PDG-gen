
import java.util.*;
public class Main {
    public static void main(String[] args) {
        final int number = new Scanner(System.in).nextInt();
        int[][] array = new int[10][10];
        /*
        - 123456789
        1 2
        2
        3
        4
        5
        6
        7
        8
        9
         */
        for (int i = 1; i <= number; i++) {
            int start = i;
            while(start >= 10) {
                start /= 10;
            }
            int end = i % 10;
            array[start][end]++;
        }
        long answer = 0;
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                answer += array[i][j] * array[j][i];
            }
        }
        System.out.println(answer);
    }
}