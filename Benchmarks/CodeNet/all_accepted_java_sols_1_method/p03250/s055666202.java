import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nums = reader.readLine().split(" ");
        Arrays.sort(nums);
        int result = Integer.parseInt(nums[0]) + Integer.parseInt(nums[2]) * 10 + Integer.parseInt(nums[1]);
        System.out.println(result);
    }
}
