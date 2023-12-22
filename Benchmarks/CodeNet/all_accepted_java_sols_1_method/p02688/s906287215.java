import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 1; i <= K; i++) {
            int d = Integer.parseInt(sc.next());
            for(int j = 1; j <= d; j++) {
                int a = Integer.parseInt(sc.next());
                if(map.containsKey(a)) {
                    continue;
                }else {
                    map.put(a, 1);
                }
            }
        }
        
        int count = 0;
        for(int i = 1; i <= N; i++) {
            if(map.containsKey(i)) {
                continue;
            }else {
                count++;
            }
        }
            
        System.out.println(count);
    }
}