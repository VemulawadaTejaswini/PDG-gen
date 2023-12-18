import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n+2];
        for(int i=0;i<n;i++){
            nums[i+1]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<n+1;i++){
            ans+=Math.abs(nums[i+1]-nums[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println(ans-(Math.abs(nums[i+2]-nums[i+1])+Math.abs(nums[i+1]-nums[i])-Math.abs(nums[i+2]-nums[i])));
        }
    }
}
