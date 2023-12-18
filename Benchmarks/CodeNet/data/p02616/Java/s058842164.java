import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.BlockingDeque;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        PriorityQueue<Integer> pos = new PriorityQueue<>((x, y) -> y - x);
        PriorityQueue<Integer> neg = new PriorityQueue<>((x, y) -> x - y);
        PriorityQueue<Integer> neg2 = new PriorityQueue<>((x, y) -> y - x);

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(a[i] > 0){
                pos.add(a[i]);
            }else{
                neg.add(a[i]);
                neg2.add(a[i]);
            }
        }

        BigDecimal ans = new BigDecimal(1);

        if(pos.isEmpty() && k % 2 == 1){
            for(int i = 0; i < k; i++){
                ans = ans.multiply(new BigDecimal(neg2.poll()));
            }
            System.out.println(ans.remainder(new BigDecimal(1000000007)));
            return;
        }

        BigDecimal p = new BigDecimal(1);
        BigDecimal po = p;
        if(pos.size() > 0){
            p = new BigDecimal(pos.poll());
            if(pos.size() > 0){
                po = p.multiply(new BigDecimal(pos.peek()));
            }else{
                po = p;
            }
        }
        BigDecimal ne = new BigDecimal(1);
        if(neg.size() > 1){
            ne = new BigDecimal(String.valueOf((new BigDecimal(neg.poll())).multiply(new BigDecimal(neg.poll()))));
        }

        for(int i = 0; i < k; i++){
            if(po.compareTo(ne) > 0){
                ans = ans.multiply(p);
                if(pos.size() > 0){
                    p = new BigDecimal(pos.poll());
                    if(pos.size() > 0){
                        po = p.multiply(new BigDecimal(pos.peek()));
                    }else{
                        po = p;
                    }
                }
            }else{
                ans = ans.multiply(ne);
                if(neg.size() > 1){
                    new BigDecimal(String.valueOf((new BigDecimal(neg.poll())).multiply(new BigDecimal(neg.poll()))));
                }
                i++;
            }
        }

        System.out.println(ans.remainder(new BigDecimal(1000000007)));

    }
}
