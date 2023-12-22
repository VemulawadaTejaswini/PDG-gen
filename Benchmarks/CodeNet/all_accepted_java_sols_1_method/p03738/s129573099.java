import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        //String str = sc.next();
        
        if(A.compareTo(B)==0){
            System.out.println("EQUAL");
        }else if(A.compareTo(B)>0){
            System.out.println("GREATER");
        }else if(A.compareTo(B)<0){
            System.out.println("LESS");
        }
        //System.out.println(ans);
    }
}
