import java.util.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int N;
        N = scanner.nextInt();
        HashMap<String, Boolean> seen = new HashMap<>();
        String[] words = new String[N+1];
        for(int i = 0; i < N; ++i) {
            words[i] = scanner.next();
        }
        String ans = "Yes";
        for(int i = 1; i < N; ++i) {
            seen.put(words[i-1], true);
            if(words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1))
                ans = "No";
            if(seen.containsKey(words[i]))
                ans = "No";
        }
        System.out.println(ans);
    }
}