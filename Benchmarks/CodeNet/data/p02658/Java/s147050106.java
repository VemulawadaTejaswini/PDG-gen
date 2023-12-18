import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        BigInteger sum = new BigInteger("1");
        BigInteger max = new BigInteger("1000000000000000000");
        long a;

        for(int i=0;i<n;i++){
            a = scn.nextLong();
            sum = sum.multiply(BigInteger.valueOf(a));
        }
        if(sum.compareTo(max)==1){
            System.out.println(-1);
        }else{
            System.out.println(sum);
        }

        scn.close();


    }


}