import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> arr = new ArrayList<>();
    for(int i = 0; i < n; i++) {
      arr.add(0, sc.nextInt());
    }
    for(int i = 0; i < n; i++) {
      if(i == n - 1) {
        Sytem.out.println(arr.get(i));
      } else {
      System.out.print(arr.get(i) + " ");}
    }
  }
}

