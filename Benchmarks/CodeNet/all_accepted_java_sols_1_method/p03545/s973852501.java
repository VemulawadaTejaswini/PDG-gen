import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] abcd = br.readLine().split("");
        int sum;
        
        for (int i = 0; i < (1<<3); i++) {
            String str = abcd[0];
            for (int j = 0; j < 3; j++) {
                if ((i & (1<<j)) >= 1) {
                    str += "+" + abcd[j+1]; 
                }
                else {
                    str += "-" + abcd[j+1]; 
                }
            }
            
            sum = Integer.parseInt(String.valueOf(str.charAt(0)));
            for (int k = 0; k < 6; k += 2) {
                if (str.charAt(k+1) == '+') {
                    sum += Integer.parseInt(String.valueOf(str.charAt(k+2)));
                }
                else {
                    sum -= Integer.parseInt(String.valueOf(str.charAt(k+2)));
                }
            }
            //System.out.println(str);
            if (sum == 7) {
                    System.out.println(str+"=7");
                    break;
            }
        }
        
        
        
        //System.out.println(sum);
    }
}
