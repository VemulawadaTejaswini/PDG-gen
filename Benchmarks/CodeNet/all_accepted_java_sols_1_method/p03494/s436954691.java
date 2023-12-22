import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();
    
    int nums[] = new int[size];
    for (int i = 0; i < size; i++) {
      nums[i] = sc.nextInt();
    }

    int count = 0;

    while(true) {
      for (int i = 0; i < size; i++) {
        if (nums[i] == 0 || nums[i] % 2 == 1) {
          System.out.println(count);
          return;
        }
        nums[i] = nums[i] / 2;
      }
      count++;
    }
  }

}