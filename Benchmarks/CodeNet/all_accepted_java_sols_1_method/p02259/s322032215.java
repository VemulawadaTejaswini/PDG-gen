import java.util.Scanner;

public class Main {
  static int counter;
  public static void main(String[] args) {
    Scanner scanInt = new Scanner(System.in);
    int N = scanInt.nextInt();
    int[] nums = new int[N];
    for(int i = 0; i < N; i++){
      nums[i] = scanInt.nextInt();
    }
    for(int i = 0; i < N; i++){
      for(int j = nums.length - 1; j > i; j--){
        if(nums[j] < nums[j-1]){
          int dum = nums[j];
          nums[j] = nums[j-1];
          nums[j-1] = dum;
          counter ++;
        }
      }
    }

    for(int i = 0; i < N-1; i++){
      System.out.print(nums[i] + " ");
    }
    System.out.println(nums[N-1]);
    System.out.println(counter);
  }

}

