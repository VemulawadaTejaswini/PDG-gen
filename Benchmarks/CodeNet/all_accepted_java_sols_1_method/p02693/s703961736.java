import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(in.readLine());
        String[] s = in.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        if(A % K == 0) {
            System.out.println("OK");
        } else {
            int mod = A % K;
            int num = A + (K - mod);
            if(num <= B && num >= A) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }
}