import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger N = BigInteger.valueOf(Long.parseLong(sc.next()));
        BigInteger A = BigInteger.valueOf(Long.parseLong(sc.next()));
        BigInteger B = BigInteger.valueOf(Long.parseLong(sc.next()));
        BigInteger num = N.divide(A.add(B));
        BigInteger rem = N.mod(A.add(B));
        if(A.compareTo(rem) == -1){
            System.out.println(num.multiply(A).add(A));
        }else{
            System.out.println(num.multiply(A).add(rem));
        }
    }
}