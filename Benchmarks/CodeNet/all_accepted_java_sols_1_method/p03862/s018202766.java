import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        long ans=0;
        ans+=Math.max(0,nums[0]-x);
        nums[0]-=ans;
        int tmp;
        for(int i=1;i<n;i++){
            tmp=Math.max(0, nums[i-1]+nums[i]-x);
            nums[i]-=tmp;
            ans+=tmp;
        }
        System.out.println(ans);
    }
    
    
}