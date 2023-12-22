import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        double percent = 0d;
        for(int i = 1 ; i <= N ; i++) {
            int point = i;
            int turn = 0;
            while(point < K) {
                turn++;
                point *= 2;
            }
            percent += 1 / (Math.pow(2, turn) * N);
        }
        System.out.println(percent);
    }
}
