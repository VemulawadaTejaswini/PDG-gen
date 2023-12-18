import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n ; i++){
            BigInteger a = new BigInteger(br.readLine());
            BigInteger b = new BigInteger(br.readLine());
            BigInteger c = a.add(b);
            String s = c.toString();
            if (s.length() > 80){
                System.out.println("overflow");
            }else{
                System.out.println(a.add(b));
            }
        } 
        
    }
}