import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    long K = in.nextLong();

    int[] path = new int[N];
    for (int i = 0; i < N; i++) {
      path[i] = in.nextInt() - 1;
    }

    int slow = path[0];
    int fast = path[path[0]];

    while (slow != fast) {
      slow = path[slow];
      fast = path[path[fast]];
    }

    // Found out the distance to the start of the loop
    int count = 0;
    slow = 0;
    while (slow != fast) {
      slow = path[slow];
      fast = path[fast];
      count++;
    }

    // Found out the distance in the loop
    int loop = 1;
    fast = path[slow];
    while (slow != fast) {
      fast = path[fast];
      loop++;
    }

    int k;

    // Doesn't go into the loop.
    if (((long) count) >= K) {
      k = (int) K;
      slow = 0;
    } else {
      k = (int) ((K - count) % ((long) loop));
    }

    for (int i = 0; i < k; i++) {
      slow = path[slow];
    }

    System.out.println(slow + 1);
  }
}
