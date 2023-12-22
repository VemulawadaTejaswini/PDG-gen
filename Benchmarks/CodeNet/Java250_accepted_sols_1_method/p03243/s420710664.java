import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        char[] digits = input.readLine().toCharArray();
        if (digits[0] >= digits[1] && digits[0] >= digits[2]) {
            System.out.println(digits[0] + "" + digits[0] + "" + digits[0]);
        }else{
            digits[0]++;
            System.out.println(digits[0] + "" + digits[0] + "" + digits[0]);
        }
    }
}
