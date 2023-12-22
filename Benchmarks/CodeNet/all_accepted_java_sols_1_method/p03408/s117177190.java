import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        Map<String, Integer> cp = new HashMap<>();
        for(int i = 0; i < N; i++) {
            String str = sc.next();
            if( cp.containsKey( str ) ) {
                int x = cp.get(str);
                cp.put(str, ++x);
            } else {
                cp.put(str, 1);
            }
        }
        int M = sc.nextInt();
        for(int i = 0; i < M; i++) {
            String str = sc.next();
            if( cp.containsKey( str ) ) {
                int x = cp.get(str);
                cp.put( str, --x );
            }
        }
        
        int max = 0;
        for( Map.Entry<String, Integer> entry : cp.entrySet() ) {
            max = Math.max( max, entry.getValue() );
        }
        System.out.println( max );
    }
}
