import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<String>();
        
        while (n-- > 0) {
            set.add(sc.next());
        }
        System.out.println(set.size());
    }
}
