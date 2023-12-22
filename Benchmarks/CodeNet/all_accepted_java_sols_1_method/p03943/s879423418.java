import java.util.*;

public class Main{
  public Main(){}
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] tokens = scanner.nextLine().split(" +");
    
 	int[] nums = new int[3];
    nums[0] = Integer.parseInt(tokens[0]);
    nums[1] = Integer.parseInt(tokens[1]);
    nums[2] = Integer.parseInt(tokens[2]);
    
    for(int i=0; i<3; i++){
      int sum = 0;
      for(int j=0; j<3; j++){
        if(i == j){
          continue;
        }
        sum += nums[j];
      }
      
      if(sum == nums[i]){
        System.out.println("Yes");
        return;
      }
    }
    
    System.out.println("No");
    
  }
}