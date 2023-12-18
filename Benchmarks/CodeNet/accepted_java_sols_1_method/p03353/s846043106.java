import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        String s = sc.next();
        int k = sc.nextInt();
        Set<String> subs = new HashSet<>();
        
        for(int i = 1; i <= k; ++i) {
            for(int tail = i; tail <= s.length(); ++tail) {
                int head = tail - i;
                subs.add(s.substring(head, tail));
            }
        }
        
        String[] subStringArray = subs.toArray(new String[0]);
        Arrays.sort(subStringArray);
        System.out.println(subStringArray[k - 1]);
    }
}
