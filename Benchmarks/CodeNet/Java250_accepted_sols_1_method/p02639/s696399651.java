

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] nums = new int[5];
        for(int i = 0 ; i< 5;i++){
        
        nums[i] = scanner.nextInt();
               }
        
         for(int i = 0 ; i< 5;i++){
         if(nums[i] == 0){
             System.out.println(i+1);
         }
         
         
         
         }
        
        
        
    }
    
}
