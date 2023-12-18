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
        int tmp=1;
        int output=0;
        for(int i=n;i>0;i--){
            if(nums[i]!=nums[i-1]){
                output+=tmp%2;
                tmp=1;
            }else{
                tmp++;
            }
        }
        System.out.println(output);
    }
 
    
}