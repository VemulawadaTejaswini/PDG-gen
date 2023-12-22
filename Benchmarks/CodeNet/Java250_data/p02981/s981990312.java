import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nums = s.nextLine().split(" ");
        int n=Integer.parseInt(nums[0]);
        int a=Integer.parseInt(nums[1]);
        int b=Integer.parseInt(nums[2]);
        if(n*a > b){
            System.out.println(b);
        }else{
            System.out.println(n*a);
        }
    }
}