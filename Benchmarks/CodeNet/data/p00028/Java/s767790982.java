import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    int[] nums = new int[100];
    for(int i = 0; i < 100; i++) nums[i] = 0;

    while(sc.hasNext()) {
      nums[sc.nextInt() - 1]++;
    }

    int max = 0;
    for(int i = 0; i < 100; i++) {
      if(nums[i] > max) max = nums[i];
    }

    for(int i = 0; i < 100; i++) {
      if(nums[i] == max) System.out.println(i + 1);
    }
  }

  private final Scanner sc = new Scanner(System.in);
}