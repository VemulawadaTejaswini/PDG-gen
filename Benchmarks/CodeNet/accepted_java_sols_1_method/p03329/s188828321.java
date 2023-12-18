import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    Set<Integer> set = new HashSet<Integer>();
    set.add(1);

    int six = 6;
    while (six <= N) {
      set.add(six);
      six *= 6;
    }

    int nine = 9;
    while (nine <= N) {
      set.add(nine);
      nine *= 9;
    }

    int[] nums = new int[N + 1];

    for (int i = 1; i <= N; i++) {
      for (Integer n : set) {
        if (n <= i) {
          if (nums[i] == 0) {
            nums[i] = nums[i - n] + 1;
          } else {
            nums[i] = Math.min(nums[i], nums[i - n] + 1);
          }
        }
      }
    }

    System.out.println(nums[N]);
  }
}