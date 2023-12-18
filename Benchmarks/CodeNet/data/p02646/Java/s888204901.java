import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        String[] str1 = c.nextLine().split(" ");
        String[] str2 = c.nextLine().split(" ");
        String str3 = c.nextLine();

        BigInteger position1 = new BigInteger(Long.parseLong(str1[1]) + "");
        position1 = position1.multiply(new BigInteger(Long.parseLong(str3) + ""));
        position1 = position1.add(new BigInteger(Long.parseLong(str1[0]) + ""));

        BigInteger position2 = new BigInteger(Long.parseLong(str2[1]) + "");
        position2 = position2.multiply(new BigInteger(Long.parseLong(str3) + ""));
        position2 = position2.add(new BigInteger(Long.parseLong(str2[0]) + ""));

        if (position1.compareTo(position2) >= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}