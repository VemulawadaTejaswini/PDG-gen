import java.util.*;
import java.math.BigInteger;

class Main {

    static void solve(BigInteger num1, BigInteger num2) {

        String result = num1.add(num2).toString();

        if (result.length() > 80) {
            result = "overflow";
        }

        System.out.println(result);

    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        while (sc.hasNext()) {
            BigInteger number1 = new BigInteger(sc.nextLine());
            BigInteger number2 = new BigInteger(sc.nextLine());

            solve(number1, number2);
        }

    }
}