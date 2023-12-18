import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            String[] nums = line.split(" ");
            Integer num1 = Integer.parseInt(nums[0]);
            Integer num2 = Integer.parseInt(nums[1]);
            System.out.println(num1 + num2);
        }
    }
}