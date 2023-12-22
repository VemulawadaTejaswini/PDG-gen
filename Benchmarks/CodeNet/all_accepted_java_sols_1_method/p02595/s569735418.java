import java.util.Scanner;
 
public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        long d = stdIn.nextLong();

        long[] x = new long[n];
        long[] y = new long[n];
        for(int i=0; i<n; i++){
            x[i] = stdIn.nextLong();
            y[i] = stdIn.nextLong();
        }

        int cnt = 0;
        long d2 = d * d;
        long dist2 = 0;
        for(int i=0; i<n; i++){
            dist2 = x[i] * x[i] + y[i] * y[i];
            if(dist2 <= d2){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}