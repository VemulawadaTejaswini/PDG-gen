import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        BigInteger sum = new BigInteger("0");
        for(int i = 1; i <= N; i++){
            if((i%3!=0)&&(i%5!=0)){
                BigInteger t = new BigInteger(String.valueOf(i));
                sum = sum.add(t);
            }
        }
        System.out.print(sum);
    }

}
