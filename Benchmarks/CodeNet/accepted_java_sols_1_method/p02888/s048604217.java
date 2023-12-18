import java.math.BigInteger;
    import java.util.*;
    import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    TreeSet<Integer> l = new TreeSet<>();
    ArrayList<Integer> lList = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int tmp = sc.nextInt();
      l.add(tmp);
      lList.add(tmp);
    }
    lList.sort(Comparator.naturalOrder());

    Map<Integer, Integer> indexMap = new HashMap<>();
    int pre = -1;
    for (int i = 0; i < n; i++) {
      if (pre != lList.get(i)) {
        indexMap.put(pre, i - 1);
        pre = lList.get(i);
      }
    }
    indexMap.put(lList.get(lList.size() - 1), lList.size() - 1);

    long result = 0;
    for (int i = 0; i < n; i++) {
      int a = lList.get(i);
      for (int j = i + 1; j < n; j++) {
        int b = lList.get(j);
        int sum = a + b;
        int max = l.headSet(sum).last();
        int maxIndex = indexMap.get(max);
        result += Math.max(maxIndex - j, 0);
      }
    }
    System.out.println(result);
  }
}
