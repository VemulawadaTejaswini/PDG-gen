import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        s = stdR.readLine().split(" ");
        int count = 0;
        for(int i = 0 ; i < N ; i++) {
            if(Integer.parseInt(s[i]) >= K)count++;
        }
        System.out.println(count);
    }
}
