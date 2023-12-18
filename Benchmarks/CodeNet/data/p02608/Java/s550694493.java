import java.math.*;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[100000];

        for (int x=1; x<=100; x++) {
            for (int y=1; y<=100; y++) {
                for (int z=1; z<=100; z++) {
                    int ans = x * x + y * y + z * z + x * y + y * z + z * x;
                    arr[ans-1]++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            sb.append(arr[i] + "\n");
        }

        System.out.print(sb.toString());
    }


}

