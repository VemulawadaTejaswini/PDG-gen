import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long num = sc.nextLong();
        if(num == 1){
            System.out.println(0);
            return;
        }

        Map<Long, Long> map = devide(num);

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

        if(count != 0){
            System.out.println(count);
        }else{
            System.out.println(1);
        }
    }

    static Map<Long, Long> devide(long num){
        long tmpnum = num;
        Map<Long, Long> map = new HashMap<>();
        for(long i=2; i*i < num; i++){
            // <2, count>, <3, count>...
            long count = 0;
            while(tmpnum % i == 0){
                tmpnum = tmpnum / i;
                count++;
            }
            if(count != 0){
                map.put(i, count);
            }
        }
        if(tmpnum != 1){
            map.put(tmpnum, 1L);
        }
        return map;
    }
}