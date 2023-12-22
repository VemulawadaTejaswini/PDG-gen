import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d, need, i = 0, count = 0;
    d = Integer.parseInt(sc.next());
    need = Integer.parseInt(sc.next());
    while(true) {
      if(i * (d - 1) + 1 >= need) break;
      i++;
    }
    System.out.println(i);
  }
}
