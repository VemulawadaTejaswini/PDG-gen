import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String blank = " ";

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String input = null;

        try {
            while ((input = in.readLine()) != null) {

                String[] problemData = input.split(blank);

                int num1 = Integer.valueOf(problemData[0]);
                int num2 = Integer.valueOf(problemData[1]);

                int gcd = resolveGcd(num1, num2);
                long lcm = (long) (num1 / gcd * num2);

                System.out.println(gcd + blank + lcm);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static int resolveGcd(int num1, int num2) {

        int result = num1 % num2;

        if (result == 0) {
            return num2;
        }

        return resolveGcd(num2, result);
    }
}