import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[] arr = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).sorted(Comparator.reverseOrder()).mapToInt(Integer::valueOf).toArray();
    int first = arr[0];
    Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    queue.add(first);
    int result = 0;
    for (int i = 1; i < n; i++) {
      int value = queue.poll();
      queue.add(arr[i]);
      queue.add(arr[i]);
      result += value;
    }
    System.out.println(result);
  }
}
