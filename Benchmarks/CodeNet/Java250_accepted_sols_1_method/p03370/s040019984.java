import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            int m = sc.nextInt();
            X -= m;
            sum++;
            min = Math.min( min, m );
        }
        sum += X / min;
        System.out.println(sum);
    }
}
