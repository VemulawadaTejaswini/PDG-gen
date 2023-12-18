import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long a = 0, b = 0;
        Map<Long, Long> map = new HashMap<Long, Long>();
        map.put(0L, 0L);
        for (long i = 1; i < 1000; i++) {
            long a5 = (long) Math.pow(i, 5);
            if(a5 < x){
                if(map.containsKey(x - a5)){
                    a = i;
                    b = - map.get(x-a5);
                    break;
                }
                map.put(a5, i);
            }else{
                if(map.containsKey(a5 - x)){
                    a = i;
                    b = map.get(a5 - x);
                    break;
                }
                map.put(a5, i);
            }
        }
        System.out.println(a + " " + b);
        sc.close();

    }

}
