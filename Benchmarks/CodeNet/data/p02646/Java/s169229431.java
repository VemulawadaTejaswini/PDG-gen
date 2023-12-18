import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int nums[] = new int[5];
    for(int i = 0; i < nums.length;i++)
      nums[i] = sc.nextInt();
    
    if(nums[1] <= nums[3]){
      System.out.print("NO");
    }else{
      for(int i = 0; i < nums[4] + 1; i++){
        if(nums[0] >=  nums[2]){
          System.out.print("YES");
          break;
        }else if(nums[4] == i){
          System.out.print("NO");
        }
        nums[0] += nums[1];
        nums[2] += nums[3];
      }
    }
  }
}