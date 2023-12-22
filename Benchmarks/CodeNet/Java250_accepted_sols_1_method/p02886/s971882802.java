// AtCoder Beginner Contest 143b
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // Input
        Scanner sc = new Scanner(System.in);

        int kosuu = sc.nextInt();
        int[] arrayOishi = new int[kosuu];
        for ( int i = 0; i < arrayOishi.length; i++ ) {
            arrayOishi[i] = sc.nextInt();
        }

        // Calc
        int result = 0;
        for ( int j = 0; j < kosuu; j++ ) {
           int curTY = arrayOishi[j];
           for ( int k = j + 1; k < kosuu; k++ ) {
              int nextTY = arrayOishi[k];
              result += curTY * nextTY;
           }
        }

        // Output
        System.out.println(result);

        sc.close();
    }
}