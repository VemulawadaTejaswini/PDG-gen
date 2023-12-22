import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

 
public class Main {
 
    public static final int BIG_NUM  = 2000000000;
 
    public static void main(String[] args) {
        int max = -BIG_NUM, min = BIG_NUM;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        try {
            int N = Integer.parseInt(br.readLine());
 
            for(int loop = 0; loop < N; loop++){
                int tmp = Integer.parseInt(br.readLine());
                max = Math.max(max, tmp - min);
                min = Math.min(min, tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        System.out.println(max);
    }
}
