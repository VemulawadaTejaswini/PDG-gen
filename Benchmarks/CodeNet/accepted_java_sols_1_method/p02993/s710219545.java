import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String s = stdR.readLine();
        boolean conse = false;
        char before = s.charAt(0);
        for(int i = 1 ; i < s.length(); i++) {
            if(before == s.charAt(i))conse = true;
            before = s.charAt(i);
        }
        if(conse) {
            System.out.println("Bad");
        }else {
            System.out.println("Good");
        }
    }
}
