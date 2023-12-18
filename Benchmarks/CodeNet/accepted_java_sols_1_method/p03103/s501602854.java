import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        Map<Integer,Long> map = new TreeMap<>();
        for (int i = 0; i < N ; i++) {
            int price  = sc.nextInt();
            long avail = sc.nextInt();
            if(!map.containsKey(price)){
                map.put(price,avail);
            }else{
                map.put(price,map.get(price)+avail);
            }
        }

        long amount = 0;
        for(Map.Entry<Integer,Long> e: map.entrySet()){
            int price = e.getKey();
            long avail = e.getValue();
            if(M <= avail){
                amount += (long) M * price;
                break;
            }else{
                amount += (long) price* avail;
                M -= avail;
            }
        }

        System.out.println(amount);

    }}