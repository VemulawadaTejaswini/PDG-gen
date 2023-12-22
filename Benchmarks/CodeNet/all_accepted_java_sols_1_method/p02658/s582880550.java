import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.nextLine();
    long multi = 1;
    long max = (long)Math.pow(10.0, 18.0);
    long[] nums = new long[num];
    
    for(int i = 0; i < num; i++){
      nums[i] = sc.nextLong();
      if(nums[i] == 0){
      	System.out.println(0);
        return;
      }
    }
    for(int j = 0; j < num; j++){
      if(multi <= max / nums[j]){
        multi *= nums[j];
      }else{
      	System.out.println("-1");
        return;
      }
    }
    
     System.out.println(multi);
    
  }

}