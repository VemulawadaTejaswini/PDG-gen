
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        List<Integer> list = check(100003);
        int ans = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i) >= X) {
                System.out.println(list.get(i));
                return;
            }
        }
    }

    public static List<Integer> check(int n) {
        // 探索リスト生成
        boolean[] search = new boolean[n+1];
        Arrays.fill(search, true);

        // 素数でないものはfalseにする
        for(int i=2; i<Math.sqrt(n); i++){
            // 素数の倍数なら何もしない
            if(!search[i]){
                continue;
            }

            // 素数の倍数をふるい落とし
            for(int j=2; i*j <= n; j++){
                search[i*j] = false;
            }
        }

        List<Integer> primeList = new ArrayList<>();
        for(int i=2; i<search.length; i++) {
            if (search[i]) {
//                System.out.println(i);
                primeList.add(i);
            }
        }
        return primeList;
    }
}