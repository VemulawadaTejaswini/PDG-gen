import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        Map<Integer,Integer>map = new HashMap<>();
        for(int i= 0; i<N; i++) {
            a[i] = Integer.parseInt(sc.next());
            if(map.containsKey(a[i])) {
                map.remove(a[i]);
            }else {
                map.put(a[i], 1);
            }
        }
        System.out.println(map.size());
        
    }
}