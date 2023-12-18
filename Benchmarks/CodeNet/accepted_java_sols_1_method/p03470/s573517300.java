import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        int ans=n;
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i])ans--;
        }
        System.out.println(ans);
    }

}