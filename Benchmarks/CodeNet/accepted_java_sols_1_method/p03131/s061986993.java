import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] str = stdR.readLine().split(" ");
        long K = Long.parseLong(str[0]);
        long A = Long.parseLong(str[1]);
        long B = Long.parseLong(str[2]);
        if(A + 1 < B) {
            if(K <= A) {
                System.out.println(K + 1);
            }else {
                K = K - A + 1;
                System.out.println(A + (B - A) * (K / 2) + K % 2);
            }
        }else {
            System.out.println(1 + K);
        }
    }
}
