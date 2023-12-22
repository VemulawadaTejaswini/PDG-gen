import java.util.*;
public class Main {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[] nums=new int[1000000];
        nums[0]=s;
        
        flag:for(int i=0;i<999999;i++){
            nums[i+1]=nums[i]%2==0?nums[i]/2:nums[i]*3+1;
            for(int j=0;j<i;j++){
            if(nums[i+1]==nums[j]){
                System.out.println(i+1+1);
                break flag;
            
        }
        }
        
            
        }
            
            
        
        
        

    }
    
}