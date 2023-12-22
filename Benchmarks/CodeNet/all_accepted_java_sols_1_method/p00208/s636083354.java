import java.util.*;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Long e = Long.parseLong(sc.next());

    Map<Long, Long> map = new HashMap<>();
    map.put(0L, 0L);
    map.put(1L, 1L);
    map.put(2L, 2L);
    map.put(3L, 3L);
    map.put(4L, 5L);
    map.put(5L, 7L);
    map.put(6L, 8L);
    map.put(7L, 9L);
    while (!e.equals(0L)) {
      List<Long> lists = new ArrayList<>();
      while (e / 8 != 0) {
        lists.add(map.get(e % 8L));
        e = e / 8L;
      }
      lists.add(map.get(e % 8L));
      Collections.reverse(lists);
      System.out.println(lists.stream().map(Object::toString).collect(Collectors.joining("")));
      e = Long.parseLong(sc.next());
    }
  }
}
