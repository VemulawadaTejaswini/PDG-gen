import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        
        int index = 1;
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            words[i] = word;
            //System.out.println(word);
        }
            
            
        for (int i = 0; i < n; i++) {    
            if (i == 0) continue;
            else {
                if (words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)) {
                    ok = false;
                    break;
                }
                for (int j = 0; j < n; j++) {
                    if (i==j) continue;
                    if (words[i].equals(words[j])) {
                        ok = false;
                        break;
                    }
                }
                
            }
        }
        
        if (ok) System.out.println("Yes");
        else System.out.println("No");
        
    }
}
