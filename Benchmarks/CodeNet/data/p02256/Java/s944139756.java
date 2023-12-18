import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanInt = new Scanner(System.in);
    int[] nums = new int[2];
    int gcd;
    nums[0] = scanInt.nextInt();
    nums[1] = scanInt.nextInt();
    gcd = gcd(nums[0], nums[1]);
    System.out.println(gcd);
  }

  public static int gcd(int num_1, int num_2){
    if (num_1 % num_2 != 0){
      return gcd(num_2, num_1 % num_2);
    }else{
      return num_2;
    }
  }


}


