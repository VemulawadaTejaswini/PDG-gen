import java.util.Scanner;

public class Main {

  public static void showArray(int[] nums){
    for(int i = 0; i < nums.length - 1; i++){
      System.out.print(nums[i] + " ");
    }
    System.out.print(nums[nums.length - 1]);
    System.out.println("");
  }

  public static void main(String[] args) {
    Scanner scanInt = new Scanner(System.in);
    int n;
    int i, j;
    int dummy;
    n = scanInt.nextInt();
    int[] nums = new int[n];
    for(i = 0; i < n; i++){
      nums[i] = scanInt.nextInt();
    }

    for(i = 0; i < n; i++){
      dummy = nums[i];
      j = i - 1;
      while(j >= 0 && nums[j+1] < nums[j]){
        nums[j+1] = nums[j];
        nums[j] = dummy;
        j--;
      }
      showArray(nums);
    }



  }
}

