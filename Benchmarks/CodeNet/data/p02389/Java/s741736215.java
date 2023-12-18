import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nums=reader.readLine().split(" ");
        int num1=Integer.parseInt(nums[0]);
        int num2=Integer.parseInt(nums[1]);
        System.out.println(Integer.toString(num1*num2) + " " + Integer.toString((num1+num2)*2));
	}
}