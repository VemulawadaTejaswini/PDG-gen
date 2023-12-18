import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n+1];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        int count=1;
        int ans=0;
        for(int i=n;i>0;i--){
            if(nums[i]!=nums[i-1]){
                ans+=count>=nums[i]?count-nums[i]:count;
                count=1;
            }else{
                count++;
            }
        }
        System.out.println(ans);
    }

    
}