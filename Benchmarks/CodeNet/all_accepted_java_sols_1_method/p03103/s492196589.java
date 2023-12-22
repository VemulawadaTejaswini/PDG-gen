import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 値段、個数
        Map<Integer, Integer> map = new TreeMap<>();
        
        for(int i = 0; i < N; i ++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            Integer BB = map.get(A);
            if ( BB == null ){
                map.put(A, B);
            } else {
                map.put(A, BB + B);
            }
        }
        
        long ans = 0;
        for(int nedan : map.keySet()){
            int kosuu = map.get(nedan);
            if( kosuu < M ){
                ans += (long)nedan * kosuu;
                M -= kosuu;
            } else {
                ans += (long)nedan * M;
                break;
            }
        }
        
        System.out.println(ans);

    }
}
