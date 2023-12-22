import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        br.close();
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);

        if( a > 9 || b > 9) System.out.println(-1);
        else System.out.println(a*b);
    }
}