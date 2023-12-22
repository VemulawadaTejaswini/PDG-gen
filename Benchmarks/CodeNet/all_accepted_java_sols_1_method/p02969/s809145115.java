
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;
public class Main {

    public static void main(String[] args) throws Exception {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        String s = reader.readLine();
        
        String arr[]=s.split(" ");
        
        int a = Integer.valueOf(arr[0]);
   
        System.out.println(3 * a * a);
        
        
    }

}



