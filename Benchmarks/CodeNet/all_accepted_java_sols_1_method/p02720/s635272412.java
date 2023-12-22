import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    long res;
    long digit = 1; // 現在扱う桁
    ArrayList<ArrayList<Long>> pre = new ArrayList<>(10); // 先頭の数ごとに最新の桁のルンルン数を保持しておく
    ArrayList<Long> list = new ArrayList<>();
    for (long i = 0; i <= 9; i++) {
      pre.add(new ArrayList<Long>());
      pre.get((int)i).add(i);
      if (i == 0) continue;
      list.add(i);
    }

    while(list.size() < k) {
      digit *= 10;
      ArrayList<ArrayList<Long>> prepre = new ArrayList<>();
      for (int i = 0; i <= 9; i++) {
        prepre.add(new ArrayList<>());
        prepre.get(i).addAll(pre.get(i));
      }
      for (ArrayList<Long> e: pre) {
        e.clear();
      }
        pre.get(0).addAll(prepre.get(0));
        pre.get(0).addAll(prepre.get(1));
      for (int i = 1; i <= 8; i++) {
        for (long e: prepre.get(i-1)) {
          list.add(i*digit+e);
          pre.get(i).add(i*digit+e);
        }
        for (long e: prepre.get(i)) {
          list.add(i*digit+e);
          pre.get(i).add(i*digit+e);
        }
        for (long e: prepre.get(i+1)) {
          list.add(i*digit+e);
          pre.get(i).add(i*digit+e);
        }
      }
        for (long e: prepre.get(8)) {
          list.add(9*digit+e);
          pre.get(9).add(9*digit+e);
        }
        for (long e: prepre.get(9)) {
          list.add(9*digit+e);
          pre.get(9).add(9*digit+e);
        }
      }
    res = list.get(k-1);
    System.out.println(res);
    sc.close();
  }
}