
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
    Arrays.sort(arr);
    boolean is575 = (arr[0] == 5 && arr[1] == 5 && arr[2] == 7);

    System.out.println(is575 ? "YES" : "NO");
  }
}
