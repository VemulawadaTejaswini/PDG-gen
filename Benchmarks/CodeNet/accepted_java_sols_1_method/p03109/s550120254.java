import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String[] dateStrings = str.split("/");

        BigInteger tmp = new BigInteger(dateStrings[0] + dateStrings[1] + dateStrings[2]);

        BigInteger judgeDay = new BigInteger("20190430");

        if(0 <= judgeDay.compareTo(tmp)){
            System.out.println("Heisei");
        }else{
            System.out.println("TBD");
        }
    }

}