import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] colors = new int[N];

        for (int i = 0; i < N; i++) {
            colors[i] = sc.nextInt();
        }

        int ret = 0;

        int j = 0;
        while (j < N) {
            int topNum = colors[j];
            int sucCount = 1;

            while (j+1 < N && topNum == colors[j+1]) {
                j++;
                sucCount++;
            }

            if (sucCount % 2 == 0) {
                ret += sucCount / 2;
            } else {
                ret += (sucCount - 1) / 2;
            }

            j++;
        }

        System.out.println(ret);
    }
}