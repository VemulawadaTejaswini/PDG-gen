import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        for(int i=0; i<n; i++){
            x[i] = stdIn.nextInt();
            y[i] = stdIn.nextInt();
        }
        
        long max_x_minus_y = Long.MIN_VALUE;
        long min_x_minus_y = Long.MAX_VALUE;
        for(int i=0; i<n; i++){
            long x_minus_y = x[i] - y[i];
            if(max_x_minus_y < x_minus_y)
                max_x_minus_y = x_minus_y;
            if(x_minus_y < min_x_minus_y)
                min_x_minus_y = x_minus_y;
        }

        long max_x_plus_y = Long.MIN_VALUE;
        long min_x_plus_y = Long.MAX_VALUE;
        for(int i=0; i<n; i++){
            long x_plus_y = x[i] + y[i];
            if(max_x_plus_y < x_plus_y)
                max_x_plus_y = x_plus_y;
            if(x_plus_y < min_x_plus_y)
                min_x_plus_y = x_plus_y;
        }

        long ans = Math.max(max_x_minus_y - min_x_minus_y, max_x_plus_y - min_x_plus_y);
        System.out.println(ans);
    }
}