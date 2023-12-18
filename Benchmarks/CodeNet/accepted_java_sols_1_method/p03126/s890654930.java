import java.util.*;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();
    int totalType = sc.nextInt();

    List<Integer> likes = new ArrayList<>();

    for (int i = 0; i < number; i++) {
      int type = sc.nextInt();

      for (int j = 0; j < type; j++) {
        likes.add(sc.nextInt());
      }
    }

    Map<Integer, Long> groupingLikes = likes
      .stream()
      .collect(Collectors.groupingBy(like -> like, Collectors.counting()));

    int result = 0;
    for (Long v : groupingLikes.values()) {
      if(v == number) {
        result++;
      }
    }

    System.out.println(result);
  }

}
