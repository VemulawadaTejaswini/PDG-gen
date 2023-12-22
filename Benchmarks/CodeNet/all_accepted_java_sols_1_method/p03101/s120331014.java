import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height, width, black_height, black_width, area;
    height = Integer.parseInt(sc.next());
    width = Integer.parseInt(sc.next());
    black_height = Integer.parseInt(sc.next());
    black_width = Integer.parseInt(sc.next());
    area = (height - black_height) * (width - black_width);
    System.out.println(area);
  }
}
