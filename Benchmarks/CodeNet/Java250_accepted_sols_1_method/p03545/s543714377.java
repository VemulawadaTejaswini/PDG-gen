import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] nums = new int[]{1,2,2,2};
      for(int i = 3; i>=0; i--) {
          nums[i] = n % 10;
          n /= 10;
      }
      
      for(int i = 0; i < (1 << 3); i++) { // 0: -, 1: +
          int res = nums[0];
          for(int j = 1; j < nums.length; j++) {
              if(((i >> (j-1)) & 1) == 0)
                res -= nums[j];
              else
                res += nums[j];
          }
          if(res == 7) {
            StringBuilder sb = new StringBuilder();
            sb.append((char)(nums[0]+'0'));
            for(int j = 1; j < nums.length; j++) {
              if(((i >> (j-1)) & 1) == 0)
                sb.append('-');
              else
                sb.append('+');
              sb.append((char)(nums[j]+'0'));
            }
            
            System.out.println(sb.toString() + "=7");
            return;
          }
      }

  }
}

