import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int K = sc.nextInt();
    ArrayList<Integer> num = new ArrayList<>();
    for (int i = 0; i < K; i++) {
      if (!num.contains(A + i)) {
        num.add(A + i);
      }
      if (!num.contains(B - i)) {
        num.add(B - i);
      }
    }
    Collections.sort(num);
    for (int i = 0; i < num.size(); i++) {
      int tmp = num.get(i);
      if (tmp >= A && tmp <= B) {
        System.out.println(tmp);
      }
    }
  }
}
