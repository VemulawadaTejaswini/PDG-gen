import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jamesbond on 2/20/14.
 */
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = br.read();
        int b = br.read();
        int c = a+b;
        String s = Integer.toString(c);
        System.out.println(s.length());

    }
}