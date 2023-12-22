import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String s = stdR.readLine();
        int n = 0;
        for(int i = 0 ; i < s.length(); i++) {
            if(s.charAt(i) == '1')n++;
        }
        System.out.println(n);
    }
}