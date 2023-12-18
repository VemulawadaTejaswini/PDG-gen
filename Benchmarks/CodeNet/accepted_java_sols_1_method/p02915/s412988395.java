
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        String s = reader.readLine();
        Integer a = Integer.valueOf(s);
        
        System.out.println((int)Math.pow(a,3));
    }

}
