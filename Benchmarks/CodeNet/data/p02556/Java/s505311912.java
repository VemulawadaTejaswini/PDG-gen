import java.util.*;
public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        new Main().run();
    }
    void run() {

        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int[] z = new int[n];
        for (int i=0; i<n; i++) z[i] = arr[i][0] + arr[i][1];
        int[] w = new int[n];
        for (int i=0; i<n; i++) w[i] = arr[i][0] - arr[i][1];

        Arrays.sort(z);
        Arrays.sort(w);

        System.out.print(Math.max(z[n-1]-z[0], w[n-1]-w[0]));
    }
}

