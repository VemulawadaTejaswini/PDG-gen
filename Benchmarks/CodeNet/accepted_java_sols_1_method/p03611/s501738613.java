import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ans = 0;
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(sc.next());
            map.put(num-1, map.containsKey(num-1)?map.get(num-1)+1: 1);
            ans = Math.max(ans, map.get(num-1));
            map.put(num, map.containsKey(num)?map.get(num)+1: 1);
            ans = Math.max(ans, map.get(num));
            map.put(num+1, map.containsKey(num+1)?map.get(num+1)+1: 1);
            ans = Math.max(ans, map.get(num+1));
        }
        System.out.println(ans);
    }
}
