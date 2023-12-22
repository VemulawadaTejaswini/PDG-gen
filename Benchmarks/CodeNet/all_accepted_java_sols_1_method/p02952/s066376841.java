import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    long count = IntStream.rangeClosed(1, N)
      .mapToObj(String::valueOf)
      .filter(s -> s.length() % 2 != 0)
      .count();
    
    System.out.println(count);
  }
}