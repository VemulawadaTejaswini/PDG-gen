import java.math.BigDecimal;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int length = sc.nextInt();
        BigDecimal ans = new BigDecimal("1");
        for(int i=0; i<length; i++){
            ans = ans.multiply(new BigDecimal(sc.next()));
        }
        if(ans.compareTo(new BigDecimal(("1000000000000000000"))) < 1){
            System.out.println(ans);
        }else {
            System.out.println(-1);
        }
    }
}