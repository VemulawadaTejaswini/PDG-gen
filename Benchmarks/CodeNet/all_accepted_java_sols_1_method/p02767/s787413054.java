import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i=0; i<n; i++) x[i] = sc.nextInt();

        long ans = Long.MAX_VALUE;

        for (int i=1; i<=100; i++){
            int tmp = i;
            long sum = 0;
            for (int j=0; j<n; j++){
                sum += Math.pow(x[j]-tmp, 2);
            }
            ans = Math.min(ans, sum);
        }

        System.out.print(ans);



//        Arrays.sort(x);



    }
}
