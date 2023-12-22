import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> arr = new ArrayList<>();
    int min = 0;
    int max = 0;
    for(int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
      if(i == 0) {
        min = arr.get(0);
        continue;
      } else {
        if(min > arr.get(i - 1)) {
          min = arr.get(i - 1);
        }
        if(i == 1) {
          max = arr.get(1) - arr.get(0);
        } else if(max < arr.get(i) - min) {
          max = arr.get(i) - min;
        }
      }
    }
    System.out.println(max);
  }
}

