import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strAry[] = br.readLine().split(" ");
    
        int x = Integer.parseInt(strAry[0]);
        int y = Integer.parseInt(strAry[1]);
        
        String op;
    
        op = x > y ? ">": x == y  ? "==" : "<";
        
        System.out.println("a " + op + " b");
    }
}