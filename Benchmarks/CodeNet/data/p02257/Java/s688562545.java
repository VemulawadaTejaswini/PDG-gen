import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++){
            int m = Integer.parseInt(br.readLine());
            if (millerRabinTest(m)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean millerRabinTest(int q){
        if (q == 2) return true;
        if (q < 2 || ((q&1) == 0)) return false;
        
        int d = (q - 1) >> 1;
        while ((d & 1) == 0){
            d >>= 1;
        }
        
        int k = 50;
        Random r = new Random();
        for (int i = 0; i < k; i++){
            double a = 1 + r.nextInt(q-1);
            double t = d;
            double dq = q;
            double y = Math.pow(a, t)%dq;
            while (t != dq - 1 && y != 1 && y != dq - 1){
                y = Math.pow(y, 2)%dq;
                int tmp = (int) t;
                tmp <<= 1;
                t = (double) tmp;
            }
            int tmp2 = (int) t;
            if ((y != dq - 1)&&(((tmp2&1) == 0))){
                return false;
            }
        }
        return true;
    }
}