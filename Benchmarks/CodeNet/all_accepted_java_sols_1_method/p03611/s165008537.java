import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[100001];
        for(int i=0;i<n;i++){
            nums[sc.nextInt()]++;
        }
        int output=0;
        for(int i=1;i<99999;i++){
            output=Math.max(output,nums[i-1]+nums[i]+nums[i+1]);
        }
        System.out.println(output);
    }
 
    
}
