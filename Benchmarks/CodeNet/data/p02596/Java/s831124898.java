import java.math.BigDecimal;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long k = sc.nextInt();
        long kb = k;

        if(k % 2 == 0){
            System.out.println(-1);
            return;
        }

        //System.out.println(k);
        while(judge(kb) == 0){
            //System.out.println(kb);
            kb += k;
        }

        System.out.println(judge(kb));

    }

    static long judge(long k){
        String s = String.valueOf(k);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '7'){
                return 0;
            }
        }
        return s.length();
    }
}
