import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
      	if (N >= M) {
          System.out.println(0);
          return;
        }
        int[] x = new int[M];
  
        for (int i =0; i<M; i++) {
            x[i] = sc.nextInt();
        }

        Arrays.sort(x);

        int[] diff = new int[M-1];
        for (int i =1; i<M; i++) {
            diff[i-1] = x[i] - x[i-1];
        }

        Arrays.sort(diff);
        int result = 0;
        for (int i =0; i<(M-1)-(N-1); i++) {
            result += diff[i];
        }

        System.out.println(result);
    }
}