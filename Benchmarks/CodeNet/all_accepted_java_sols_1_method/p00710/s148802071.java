import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            if (n + r == 0) {
                break;
            }
            int[] rem = new int[n];
            for (int i=0; i<rem.length; ++i) {
                rem[i] = i+1;
            }

            for (int i=0; i<r; ++i) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                int[] blue = Arrays.copyOfRange(rem, n-p+1, rem.length);
                int[] yellow = Arrays.copyOfRange(rem, n-p+1-c, n-p+1);
                int[] black = Arrays.copyOfRange(rem, 0, n-p+1-c);
                for (int v=0; v<black.length; ++v) {
                    rem[v] = black[v];
                }
                for (int v=black.length; v<black.length+blue.length; ++v) {
                    rem[v] = blue[v-black.length];
                }
                for (int v=black.length+blue.length; v<black.length+blue.length+yellow.length; ++v) {
                    rem[v] = yellow[v-black.length-blue.length];
                }
            }
            System.out.println(rem[rem.length-1]);
        }
        sc.close();
    }
}

