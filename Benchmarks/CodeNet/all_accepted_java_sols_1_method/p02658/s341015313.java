import java.math.BigDecimal;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        // 0
        if(Arrays.asList(arr).contains("0")){
            System.out.println(0);
            return;
        }

        BigDecimal ans = BigDecimal.ONE;
        BigDecimal max = new BigDecimal("1000000000000000000");
        boolean over = false;
        for(String str : arr){
            ans = ans.multiply(new BigDecimal(str));

            // 上限
            if(ans.compareTo(max) == 1){
                System.out.println(-1);
                over = true;
                break;
            }
        }

        if(!over){
            System.out.println(ans);
        }
    }
}