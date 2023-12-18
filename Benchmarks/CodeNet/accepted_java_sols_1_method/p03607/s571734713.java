import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        while(n-- > 0) {
            int num = sc.nextInt();
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        
        System.out.println(set.size());
    }
}
