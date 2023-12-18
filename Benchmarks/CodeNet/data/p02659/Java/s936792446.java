import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long A = sc.nextLong();
        double B = sc.nextDouble();
        sc.close();
        if(A == 0 || B == 0){
            System.out.println(0);
            return;
        }else if(A < 100){
            double AnsDouble = A*B;
            BigDecimal bdDouble = new BigDecimal(String.valueOf(AnsDouble));
            BigDecimal bdAnsDouble = bdDouble.setScale(0, BigDecimal.ROUND_DOWN);
            //System.out.println(bdDouble);
            System.out.println(bdAnsDouble);
        }else{
            long Ans = (long)(A*B);
            BigDecimal bd = new BigDecimal(String.valueOf(Ans));
            BigDecimal bdAns = bd.setScale(0, BigDecimal.ROUND_DOWN);
            //System.out.println(Ans);
            System.out.println(bdAns);
        }
    }
}
