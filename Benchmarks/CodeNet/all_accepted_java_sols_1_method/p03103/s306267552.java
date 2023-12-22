import java.math.BigInteger;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        TreeMap<Integer, Long> map = new TreeMap<>();
        for (int i = 0 ; i < N ; i++){
            int price = sc.nextInt();
            long max_buy = sc.nextInt();
            if(map.containsKey(price)){
                long max = map.get(price);
                map.put(price, max+max_buy);
            } else{
                map.put(price, max_buy);
            }
        }

        BigInteger ans = BigInteger.ZERO;
        for (Map.Entry<Integer, Long> entry : map.entrySet()){
            int price = entry.getKey();
            long quantity = entry.getValue();
            BigInteger need = BigInteger.valueOf(quantity);
            BigInteger pri = BigInteger.valueOf(price);
            if(quantity - M >= 0){
                BigInteger temp = BigInteger.valueOf(M).multiply(pri);
                ans = ans.add(temp);
                M = - 1;
            } else{
                BigInteger temp = need.multiply(pri);
                ans = ans.add(temp);
                M -= quantity;
            }
            if(M <= 0)
                break;
        }
        System.out.println(ans.toString());
        sc.close();
    }
}
