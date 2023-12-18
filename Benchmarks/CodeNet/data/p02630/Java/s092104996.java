import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long sum = 0;
        long i = 0;
        HashMap<Long , Long> map = new HashMap<>();
        for(i = 0; i < n ; i++){
            long ai = in.nextLong();
            if(map.containsKey(ai)) {
                Long f = map.get(ai);
                map.remove(ai);
                map.put(ai , f+1);
            } else {
                map.put(ai , 1);
            }
            sum = sum + ai;
        }
        long q = in.nextInt();
        for(i = 0 ; i < q; i++){
            long bi = in.nextLong();
            long ci = in.nextLong();
            if(map.containsKey(bi)){
                long f = map.get(bi);
                sum = sum - bi*f;
                sum = sum + ci*f;
                map.remove(bi);
                if(map.containsKey(ci)){
                    f += map.get(ci);
                    map.remove(ci);
                }
                map.put(ci,f);
            }
            System.out.println(sum);
        }
    }
}