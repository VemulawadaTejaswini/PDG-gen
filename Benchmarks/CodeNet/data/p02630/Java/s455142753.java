import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        int i = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(i = 0; i < n ; i++){
            int ai = in.nextInt();
            if(map.containsKey(ai)) {
                Integer f = map.get(ai);
                map.replace(ai , f+1);
            } else {
                map.put(ai , 1);
            }
            sum = sum + ai;
        }
        int q = in.nextInt();
        for(i = 0 ; i < q; i++){
            int bi = in.nextInt();
            int ci = in.nextInt();
            if(map.containsKey(bi)){
                int f = map.get(bi);
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
