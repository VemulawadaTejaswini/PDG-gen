import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] S = stdR.readLine().split(" ");
        int N = Integer.parseInt(S[0]);
        int L = Integer.parseInt(S[1]);
        int min = Integer.MAX_VALUE;
        int minvalue = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0 ; i < N ; i++) {
            sum += (L + i);
        }
        
        for(int i = 0 ; i < N ; i++) {
            if(Math.abs(L + i) < min) {
                minvalue = sum - (L + i);
                min = Math.abs(L + i);
            }
        }
        System.out.println(minvalue);
    }
}