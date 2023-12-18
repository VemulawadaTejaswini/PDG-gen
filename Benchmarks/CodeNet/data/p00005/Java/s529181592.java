import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;


public class Main {
    private static int gcd(int a, int b)
    {
        while (b > 0)
        {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b)
    {
        return a * (b / gcd(a, b));
    }


    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader in
                = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int rows, cols;
        int two, three, a, b;
        double rate;
        boolean checker;
        double count;
        while ((line = in.readLine()) != null && !(line.equals(""))) {
                String [] temp = line.split(" ");
                a = Integer.parseInt(temp[0]);
                b = Integer.parseInt(temp[1]);

                System.out.println(gcd(a, b) + " " +lcm(a, b));

        }


    }
}