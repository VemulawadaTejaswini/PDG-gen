import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nums = s.nextLine().split(" ");
        int x = Integer.parseInt(nums[0]);
        int a = Integer.parseInt(nums[1]);
        if(x < a){
            System.out.println("0");
            return;
        }
        System.out.println("10");
    }
}