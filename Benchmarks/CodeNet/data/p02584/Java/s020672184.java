import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long solve(long X, long K, long D) {
        long movesToZero = Math.abs(X / D);
        if(K < movesToZero) {
            if(X < 0) {
                return X + K *D;
            } else {
                return X - K*D;
            }
        }
        //here we need to make a decision
        long p;
        if(X < 0) {
            p = X + movesToZero * D;
            K -= movesToZero;
        } else {
            p = X - movesToZero * D;
            K -= movesToZero;
        }

        if(K % 2 == 0) {
            return p;
        } else {
            return Math.min(Math.abs(p + D), Math.abs(p -D));
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = reader.readLine().split(" ");
        long X = Long.parseLong(split[0]);
        long K = Long.parseLong(split[1]);
        long D = Long.parseLong(split[2]);

        System.out.println(solve(X, K, D));



        //from
    }
}