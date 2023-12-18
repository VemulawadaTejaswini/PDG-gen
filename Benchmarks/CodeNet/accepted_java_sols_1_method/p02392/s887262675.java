import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strAry[] = br.readLine().split(" ");
    
        int x = Integer.parseInt(strAry[0]);
        int y = Integer.parseInt(strAry[1]);
        int z = Integer.parseInt(strAry[2]);
        
        String result;
    
        result = x >= y ? "No" : y < z  ? "Yes" : "No";
        
        System.out.println(result);
    }
}