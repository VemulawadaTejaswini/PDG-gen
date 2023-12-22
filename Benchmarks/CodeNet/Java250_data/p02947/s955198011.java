import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String[] s = new String[N];
        Map<String, Integer> map = new HashMap<>();
        
        //sに格納
        String a = "";
        String S = "";
        long ans = 0;
        for(int i = 0; i < N; i++) {
            a = sc.next();
            String[] sp = a.split("");
            Arrays.sort(sp);
            for(int j = 0; j < 10; j++) {
                S += sp[j];
            }
            if(map.containsKey(S)) {
                ans += map.get(S);
                map.put(S, map.get(S) + 1);
            }else {
                map.put(S, 1);
            }
            S = "";
        }
       System.out.println(ans);
    }
}