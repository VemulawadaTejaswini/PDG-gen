import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ", 0);
        
        int a = Integer.valueOf(input[0]);
        int b = Integer.valueOf(input[1]);
        
        int d = a / b;
        int r = a % b;
        String f = String.format("%.7f", Double.valueOf(a) / b);
        
        System.out.println(d + " " + r + " " + f);
    }
}
