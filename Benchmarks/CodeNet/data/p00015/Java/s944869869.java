
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BigInteger MAX = new BigInteger("100000000000000000000000000000000000000000000000000000000000000000000000000000000");
        int i = 0;
        Scanner sc = new Scanner(System.in);
        int dataSet = sc.nextInt();
        while ( i < dataSet ) {
            BigInteger inputedData1, inputedData2;
            inputedData1 = sc.nextBigInteger();
            inputedData2 = sc.nextBigInteger();
            if ( inputedData1.add(inputedData2).compareTo(MAX) < 0 ) {
                System.out.println(inputedData1.add(inputedData2));
            }else{
                System.out.println("overflow");
            }
            i++;
        }
    }
}