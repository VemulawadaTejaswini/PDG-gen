import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = Integer.parseInt(in.nextLine());
    List<Integer> dif = new ArrayList<>();
    while(in.hasNext()){
      dif.add(Integer.parseInt(in.next()));
    }
    Collections.sort(dif);
    int ans = dif.get(num / 2) - dif.get(num / 2 - 1);
    System.out.println(ans);
  }
}
      