import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        List<Integer> d = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
        {
            int num = Integer.parseInt(s.next());
            d.add(num);
        }

        Set<Integer> set = new HashSet<Integer>();
        for(int num : d) set.add(num);

        System.out.println(set.size());
        s.close();
    }
}
