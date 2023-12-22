import java.math.BigInteger;
import java.util.*;
public class Main {
    public  static  void main(String args[]){
        Scanner sc=new Scanner(System.in);

        BigInteger b=sc.nextBigInteger();
        BigInteger res=(b.subtract(new BigInteger("1")).multiply(b)).divide(new BigInteger("2"));
        System.out.println(res);
    }
}
