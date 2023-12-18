import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static final int INFTY = 2000000000;
    public static final int MOD   = 1000000003;
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            int N = Integer.parseInt(br.readLine());
            String[] input = new String[N];
            int[] array    = new int[N];
            
            input = br.readLine().split("\\s+");
            for(int i = 0; i < N; i++) {
                array[i] = Integer.parseInt(input[i]);
            }
            
            int Q = Integer.parseInt(br.readLine());
            String[] input_T = new String[Q];
            int tmp, ans = 0;
            
            input_T = br.readLine().split("\\s+");
            for(int i = 0; i < Q; i++) {
                tmp = Integer.parseInt(input_T[i]);
                
                for(int k = 0; k < N; k++) {
                    if(tmp == array[k]) {
                        ans++;
                        break;
                    }
                }
            }
            
            System.out.println(ans);
            
        } catch(NumberFormatException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
