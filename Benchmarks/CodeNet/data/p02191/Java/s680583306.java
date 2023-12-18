import java.util.*;
public class Main {
    static int[] nums;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        nums=new int[n+1];
        nums[n]=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        for(int i=0;i<q;i++){
            System.out.println(-(nibul(sc.nextInt())-nibur(sc.nextInt())));
        }
    }
    static int nibul(int q){
        int ans=nums.length/2;
        int toadd=nums.length/2;
        while(true){
            if(ans<0||ans>=nums.length){
                break;
            }
            if(nums[ans]>=q){
                ans-=Math.max(toadd/=2,1);
            }else if(nums[ans+1]<q){
                ans+=Math.max(toadd/=2,1);
            }else{
                break;
            }
            
        }
        return ans;
    }
    static int nibur(int q){
        int ans=nums.length/2;
        int toadd=nums.length/2;
        while(true){
            if(ans<0||ans>=nums.length){
                break;
            }
            if(nums[ans]>q){
                ans-=Math.max(toadd/=2,1);
            }else if(nums[ans+1]<=q){
                ans+=Math.max(toadd/=2,1);
            }else{
                break;
            }
            
        }
        return ans;
    }


    
}
