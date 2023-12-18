import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long sum = 0;
        for(int i = 0; i < Math.pow(2, s.length()-1); i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < s.length(); j++) {
                sb.append(s.charAt(j));
                if((1 & i >> j) == 1) {
                    sb.append("+");
                }
            }
            String[] nums = sb.toString().split("\\+");
            for(int l = 0; l < nums.length; l++) {
                sum += Long.parseLong(nums[l]);
            }
        }
        System.out.println(sum);
    }
}
