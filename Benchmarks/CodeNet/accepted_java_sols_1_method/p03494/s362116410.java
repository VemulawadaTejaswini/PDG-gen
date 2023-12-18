import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] nums = new int[n];

       for (int i = 0; i < n; i++){
           nums[i] = sc.nextInt();
       }

       int count = 0;
       boolean continueCheck = true;
       while(continueCheck){
           for (int j = 0; j < n; j++){
               if(nums[j] % 2 == 0 ){
                   nums[j] = nums[j] / 2;
               } else {
                   continueCheck = false;
                   break;
               }
           }
           if(continueCheck){
               count++;
           }
       }

       System.out.println(count);

       sc.close();

    }

}
