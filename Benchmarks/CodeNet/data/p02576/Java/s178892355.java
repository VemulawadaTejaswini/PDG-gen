import java.util.*;

public class Main{
  public static void main(String[] args){
  int[] nums = new int[3];
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < 3;i++){
      nums[i] = scanner.nextInt();
    }
    if(nums[0] % nums[1] == 0){
    	System.out.println(nums[2] * nums[0] / nums[1]);
    }else{
      int v = nums[0] / nums[1] + 1;
    System.out.println(nums[2]*v );
    }
  }
}