import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(solve(array));
    }

    public static long solve(int[] array){
        BigInteger sum = new BigInteger("0");
        BigInteger modulo = new BigInteger("1000000007");
        BigInteger newSum = new BigInteger("0");
        BigInteger product = new BigInteger("1");
        if(array.length == 1){
            return array[0];
        }
        for(int i = 0; i < array.length; i++) {
            sum = sum.add(new BigInteger(String.valueOf(array[i])));
        }
        for(int i = 0; i < array.length; i++) {
            BigInteger remainingSum = sum.subtract(new BigInteger(String.valueOf(array[i])));
            sum = remainingSum;
            product = remainingSum.multiply(new BigInteger(String.valueOf(array[i])));
            newSum = newSum.add(product);
        }
        BigInteger result = newSum.mod(modulo);
        return Long.parseLong(result.toString());
    }
}