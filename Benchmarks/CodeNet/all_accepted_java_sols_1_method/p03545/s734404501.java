import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] nums = new int[4];
    for(int i = 0; i < 4; i++){
      nums[i] = a % 10;
      a /= 10;
    }	
    int sum;
    for(int i = 0; i < 8; i++){
      sum = nums[3];
      for(int j = 0; j < 3;j++){
        if((i >> j & 1) == 1){
          sum += nums[3 - j - 1];
        }else{
          sum -= nums[3 - j - 1];
        }
      }
      if(sum == 7){
        a = i;
      }
    }
    char[] ops = new char[3];
    for(int i = 0; i < 3; i++){
      if((a >> i & 1) == 1){
        ops[i] = '+';
      }else{
        ops[i] = '-';
      }
    }
    System.out.println("" + nums[3] + ops[0] + nums[2] + ops[1] + nums[1] + ops[2] + nums[0] + "=7");
	}
}