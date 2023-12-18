
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[3];
        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }

        int count = 0;
        for(int n = 0; n < N; n++){
            Set<String> hash_set = new HashSet<String>();
            for(int i = 0; i < str.length; i++){
                hash_set.add(String.valueOf(str[i].charAt(n)));
            }
            count += hash_set.size() - 1;
        }

        out.println(count);
    }
}