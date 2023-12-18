import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Map<Long,Long> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            Long A_i = sc.nextLong();
            if(map.containsKey(A_i)){
                map.replace(A_i, map.get(A_i) + 1);
            }else {
                map.put(A_i,(long)1);
            }
        }

        int q = sc.nextInt();
        long ans = 0;

        for(int j = 0; j < q; j++){

            if(j == 0) {//一回目だけ
                for (Map.Entry<Long, Long> entry : map.entrySet()) {
                    ans += entry.getKey() * entry.getValue();
                }
            }

            long b = sc.nextInt();
            long c = sc.nextInt();

            if(map.containsKey(b)){

                ans -= b * map.get(b);

                if(map.containsKey(c)){
                    //cの方にbの個数をたす
                    map.replace(c,map.get(c) + map.get(b));
                    ans += c * map.get(b);
                    map.remove(b);

                }else {
                    //新しくcを生成してbの方に移す
                    map.put(c,map.get(b));
                    ans += c * map.get(b);
                    map.remove(b);
                }
            }

            System.out.println(ans);
        }

    }
}
