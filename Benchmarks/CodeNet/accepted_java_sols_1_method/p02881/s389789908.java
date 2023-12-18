
import java.util.*;

public class Main {

    /* チェックリスト
     * intの範囲を超えていないか
     * TLEしそうな処理の有無
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.nextLine());
        List<Long> longs = new ArrayList<>();
        for(long i = 1; true; i++){
            if(n % i == 0){
                longs.add(i);
            }
            if(i >= n / i){
                break;
            }
        }
        long min = -1;
        for(Long l : longs){
            long x = l;
            long y = n / l;
            long test = (x - 1) + (y - 1);
            if(min != -1) {
                if (min > test) {
                    min = test;
                }
            }else{
                min = test;
            }
        }
        System.out.println(min);
    }
}