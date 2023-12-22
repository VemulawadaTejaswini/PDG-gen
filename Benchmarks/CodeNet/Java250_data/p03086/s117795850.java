import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();

        int result = 0;
        int max = 0;
        for (char c : s) {
            if ('A' == c || 'C' == c || 'G' == c || 'T' == c) {
                max++;
            } else {
                result = Math.max(result, max);
                max = 0;
            }
        }
        if (max > 0) {
            result = Math.max(result, max);
        }

        System.out.println(result);
    }
}