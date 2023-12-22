import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

//        Map<Long,Long> map = new HashMap<Long,Long>();
//        for(long i=0;i<n;i++){
//            long temp = sc.nextLong();
//            map.put(temp,i+1);
//        }
//
//        Arrays.sort(map.keySet().toArray());
//
//        for(Long key : map.keySet()){
//            System.out.print(map.get(key)+" ");
//        }

        Map<Long,Long> map = new TreeMap<Long,Long>();
        for(long i=0;i<n;i++){
            long temp = sc.nextLong();
            map.put(temp,i+1);
        }
        for(Long key : map.keySet()){
            System.out.print(map.get(key)+" ");
        }





    }
}