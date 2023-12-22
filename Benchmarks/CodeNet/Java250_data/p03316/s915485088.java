import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        execute();
    }

    private static void execute() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        System.out.println(divisibleDigitSum(number));
    }

    private static String divisibleDigitSum(String number) {
        int digitSum = 0;
        for (char digit : number.toCharArray()) {
            digitSum += Integer.parseInt(String.valueOf(digit));
        }
        boolean divisible = Integer.parseInt(number) % digitSum == 0;
        return divisible ? "Yes" : "No";
    }
}