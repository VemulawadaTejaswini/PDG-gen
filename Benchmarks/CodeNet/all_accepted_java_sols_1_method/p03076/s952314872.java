import java.util.*;
public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    int[] nums = new int[5];
    for(int i = 0;i < 5;i++){
      nums[i] = sc.nextInt();
    }
    int tail = Integer.MAX_VALUE;
    int min = 0;
    for(int j = 0;j < nums.length;j++){
      	int temp = nums[j] % 10;
    	if(temp != 0 && tail > temp){
        	tail = temp;
          	min = j;
        }
    }
    int sum = 0;
    for(int j = 0;j < nums.length;j++){
    	if(j != min){
          if(nums[j] % 10 == 0){
             sum += nums[j];
          }else{
            sum += (nums[j] / 10) *10 + 10;
          }
        }
    }
    System.out.println(sum + nums[min]);
  }
}