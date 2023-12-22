import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Set<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < n; i++)
        {
            int num = Integer.parseInt(sc.next());
            s.add(num);
        }
        
        System.out.println(s.size());
        sc.close();
    }
}