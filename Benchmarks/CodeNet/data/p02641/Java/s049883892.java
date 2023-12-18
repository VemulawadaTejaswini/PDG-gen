import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[101];

        for (int i=0; i<n; i++) {
            int tmp = sc.nextInt();
            arr[tmp] = 1;
        }

        int res = 0;
        int diff = 10000;

        for (int i=0; i<arr.length; i++) {
            if (arr[i]==0) {
                if (Math.abs(i-x)<diff) {
                    diff = Math.abs(i-x);
                    res = i;
                }
            }
        }

        System.out.println(res);
    }


}
