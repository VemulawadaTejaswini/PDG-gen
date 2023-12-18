import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        long cnt = 0;

        for (int i=1; i<n; i++) {
            if (arr[i] < arr[i-1]) {
                cnt += (long)(arr[i-1] - arr[i]);
                arr[i] = arr[i-1];
            }
        }

        System.out.println(cnt);
    }


}

