
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args ) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            
            String ans = null;
            String word = reader.readLine();
            for (int j = 0 ; j < word.length(); j++ ) {
                ans = "No";
                for (int i = 0 ; i< line.length();i++ ) {
                    if (word.charAt(j) == line.charAt(i)) {
                        ans = "Yes";
                    }
                }
                if (ans == "No" ) {
                    System.out.println(ans);
                    return;
                }
            }
            System.out.println(ans);
            
            
        } catch (IOException e) {
           
        }
    }
}