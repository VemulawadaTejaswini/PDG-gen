
import java.util.Scanner;

/**
 * Created by oka on 2018/06/23.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();

        int takahashi = 0;
        for (char c: input) {
            if (c == '+') {
                takahashi++;
            } else {
                takahashi--;
            }
        }
        System.out.println(takahashi);
    }
}
