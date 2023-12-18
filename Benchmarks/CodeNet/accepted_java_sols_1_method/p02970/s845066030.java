import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] S = stdR.readLine().split(" ");
        int N = Integer.parseInt(S[0]);
        int D = Integer.parseInt(S[1]);
        int res = D * 2 + 1;
        System.out.println(N % res == 0 ? N / res : N / res + 1);
    }
}
