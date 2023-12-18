import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = Integer.parseInt(scanner.nextLine());
    String[] value = scanner.nextLine().split(" ");
    String[] cost = scanner.nextLine().split(" ");
    
    ArrayList list = new ArrayList<Integer>();
    int tmp = 0;
    for (int i = 0; i < num; i++) {
      if ((tmp = Integer.parseInt(value[i]) - Integer.parseInt(cost[i])) > 0) {
        list.add(tmp);
      }
    }
    if (list.size() == 0) {
      System.out.println("0");
    }
    else {
      Collections.sort(list, Comparator.reverseOrder());
      int sum = 0;
      for (int i = 0; i < list.size(); i++) {
        sum += (Integer)list.get(i);
      }
      System.out.println(sum);
    }
  }
}