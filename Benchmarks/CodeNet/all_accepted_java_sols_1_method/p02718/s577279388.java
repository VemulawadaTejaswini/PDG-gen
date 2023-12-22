import java.util.Arrays;
import java.util.Scanner;

/*
問題文

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int cons[] = new int[n];
        long allCount = 0;

        for (int i = 0; i < cons.length; i++) {
            cons[i] = sc.nextInt();
            allCount += cons[i];
        }

        Arrays.sort(cons);

        int count = 0;
        for (int i = 0; i < m; i++) {
            if (cons[n-1-i] >= allCount / (4.0 * m)) {
                count++;
            }
        }

        String flg = "No";
        if (count == m) {
            flg = "Yes";
        }
        System.out.println(flg);
    }
}