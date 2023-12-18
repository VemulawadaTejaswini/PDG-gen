import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[]args){
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String words = br.readLine();
        int x = Integer.parseInt(words);
        int x = x * x * x;
        System.out.println(x);

    }
}