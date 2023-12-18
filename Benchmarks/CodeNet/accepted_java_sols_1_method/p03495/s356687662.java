
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    int ballNum = scanner.nextInt();
    int ballTypeCount = scanner.nextInt();

    Map<Integer, Integer> bMap = new HashMap<Integer, Integer>();

    for (int i = 0; i < ballNum; i++) {
      int num = scanner.nextInt();
      Integer o = bMap.get(num);
      if (o != null) {
        o++;
      } else {
        o = 1;
      }
      bMap.put(num, o);
    }
    List<Integer> list = new ArrayList<Integer>(bMap.values());
    Collections.sort(list, Collections.reverseOrder());

    int writeCount = 0;

    while (list.size() > ballTypeCount) {
      writeCount = writeCount + list.get(list.size() - 1);
      list.remove(list.size() - 1);
    }

    System.out.println(writeCount);


  }

}
