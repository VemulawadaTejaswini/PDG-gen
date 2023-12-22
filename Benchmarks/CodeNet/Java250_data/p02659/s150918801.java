import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal atemp = sc.nextBigDecimal();
        BigDecimal b = sc.nextBigDecimal();
        String ans = atemp.multiply(b).toString();
//        System.out.println(ans);
//        System.out.println(ans.indexOf('.'));
        int index = ans.indexOf('.');
        System.out.println(ans.substring(0,index));

//        int n = sc.nextInt();
//        BigInteger ans = BigInteger.ONE;
//        BigInteger limit = new BigInteger("1000000000000000000");
//        for(int i=0;i<n;i++){
//            BigInteger val = sc.nextBigInteger();
//            ans = ans.multiply(val);
////            if(ans.compareTo(BigInteger.ZERO)==0){
////                break;
////            }
////            if(ans.compareTo(limit)==1){
////                break;
////            }
//        }
//        System.out.println(ans);
//        if(ans.compareTo(limit)==1){
//            System.out.println(-1);
//        }
//        else{
//            System.out.println(ans);
//        }
    }
}
