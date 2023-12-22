import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums=new int[sc.nextInt()];
        int biggest=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
            if(nums[i]>biggest)biggest=nums[i];
        }
        int a=biggest;
        for(int i=0;i<nums.length;i++){
            biggest-=nums[i];
        }
        if(biggest+a<0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
        
        

}

}
