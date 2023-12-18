import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long num = sc.nextLong();
        long div = 2;
        Map map = new HashMap<Long, Long>();
        while(num != 1){
            // <2, count>, <3, count>...
            long count = 0;
            while(num % div == 0){
                num = num / div;
                count++;
            }
            map.put(div, count);

            if(div > 1000000){
                // 10^12のroot
                break;
            }
            // divを+1する
            div++;
        }
        int count = 0;
        // 素数ごとにカウントする
        Set<Map.Entry<Long, Long>> set = map.entrySet();
        for(Map.Entry<Long, Long> entry : set){
            // 指数を順に減らしていく
            long sisu = entry.getValue();
            for(long i=0; i < sisu; i++){
                sisu -= i;
                count++;
            }
            // 余った分は最後に足すので関係なし
        }
        System.out.println(count);
    }
}