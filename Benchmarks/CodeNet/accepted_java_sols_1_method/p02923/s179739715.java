import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int idx = sc.nextInt();

    List<Integer> iArray = new ArrayList<Integer>();

    for (int i = 0; i < idx; i++) {
      iArray.add(sc.nextInt());
    }

    int count = 0;
    int maxCount = 0;
    for (int i = iArray.size() - 1; i > 0; i--) {
      if (iArray.get(i) <= iArray.get(i - 1)) {
        count++;
      } else {
        if (maxCount < count) {
          maxCount = count;
        }
        count = 0;
      }
    }
    if (maxCount < count) {
      maxCount = count;
    }

    System.out.println(maxCount);
  }
}
