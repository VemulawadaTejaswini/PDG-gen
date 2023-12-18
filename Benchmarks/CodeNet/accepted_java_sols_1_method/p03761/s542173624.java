import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] map = new int[N][26];

        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String s = scanner.nextLine();

            for (int j = 0; j < s.length(); j++) {
                map[i][(s.charAt(j) - 'a')]++;
            }
        }


        int[] ans = new int[26];

        for (int i = 0; i < 26; i++) {
            int min = 9999;
            for (int j = 0; j < N; j++) {
                min = Math.min(map[j][i], min);
            }
            ans[i] = min;
        }


        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < ans[i]; j++) {
                System.out.print((char) ('a' + i));
            }
        }

        System.out.println();

    }
}