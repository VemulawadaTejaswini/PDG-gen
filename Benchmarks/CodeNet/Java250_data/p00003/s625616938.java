import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //int n = Integer.parseInt("1");
        for(int i = 0;i < n;i++){
            String[] vals = br.readLine().split(" ",0);
            //String[] vals = "4 3 5".split(" ",0);
            int[] int_vals = new int[vals.length];
            for(int j = 0;j < int_vals.length;j++){
                int_vals[j] = Integer.parseInt(vals[j]);
            }
            Arrays.sort(int_vals);
            
            int a2 = int_vals[2] * int_vals[2];
            int b2 = int_vals[1] * int_vals[1];
            int c2 = int_vals[0] * int_vals[0];

            if(a2 == b2 + c2){
                 System.out.println("YES");
            }else{
                 System.out.println("NO");
            }
        }
    }
}