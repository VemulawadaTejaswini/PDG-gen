import java.util.*;
import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[] t = new int[N+1];
        int[] x = new int[N+1];
        int[] y = new int[N+1];


        t[0]=0;
        x[0]=0;
        y[0]=0;
        for(int i = 1; i <= N; i++){

            t[i] = scan.nextInt();;
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }

        int times = 0;
        int min_times_for_dst  = 0;
        int rest_times = 0;
        for(int i = 0; i < N; i++){

            times     = t[i+1] -t[i];
            min_times_for_dst = abs(x[i+1]-x[i]) + abs(y[i+1]-y[i]);
            rest_times = times - min_times_for_dst;

            if(times < min_times_for_dst){
                System.out.println("No");
                return;
            }

            if(rest_times% 2 != 0){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
