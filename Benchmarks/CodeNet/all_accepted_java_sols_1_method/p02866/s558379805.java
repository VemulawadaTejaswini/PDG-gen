import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        String[] s = stdR.readLine().split(" ");
        int[] D = new int[N];
        for(int i = 0 ; i < N ; i++) {
            D[i] = Integer.parseInt(s[i]);
        }
        if(D[0] != 0) {
            System.out.println("0");
        }else {
            Arrays.sort(D);
            int[] jisuu = new int[D[N - 1] + 1];
            for(int i = 0 ; i < N ; i++) {
                jisuu[D[i]]++;
            }
            if(jisuu[0] != 1) {
                System.out.println(0);
            }else {
                long count = 1;
                for(int i = 1 ; i < jisuu.length ; i++) {
                    if(jisuu[i] == 0) {
                        count = 0;
                        break;
                    }else {
                        for(int j = 1 ; j <= jisuu[i] ; j++) {
                            count *= jisuu[i - 1];
                            count %= 998244353;         
                        }
                    }
                }
                System.out.println(count);
            }
        }
    }
}
