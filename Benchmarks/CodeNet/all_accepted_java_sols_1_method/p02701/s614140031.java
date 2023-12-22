import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        
        HashSet<String> set = new HashSet();
        
        int N = in.nextInt();
        in.nextLine();
        int ans = 0;
        
        for(int i = 0; i < N; i++) {
            String s = in.nextLine();

            if(!set.contains(s)) {
                set.add(s);
                ans++;
            }
        }
        
        System.out.println(ans);
    }
    

        
}
