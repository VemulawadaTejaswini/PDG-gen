import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();
        
        Set<String> SS = new TreeSet<>();
        
        for( int i = 0; i < S.length(); i++ ) {
            for( int j = 1; j <= K; j++ ) {
                if( i + j > S.length() ) {
                    continue;
                }
                SS.add( S.substring(i, i+j) );
            }
        }
        
        Iterator<String> it = SS.iterator();
        int index = 0;
        String ans = null;
        while (it.hasNext()) {
            String x = it.next();
            if( ++index == K){
                ans = x;
            }
        }
        
        System.out.println( ans );
    }
}
