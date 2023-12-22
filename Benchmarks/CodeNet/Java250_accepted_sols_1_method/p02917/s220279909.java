import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Long> bList = new ArrayList<>();
    for (int i = 0; i < n - 1; i++) {
      bList.add(sc.nextLong());
    }
    long result = bList.get(0) + bList.get(n - 2);
    for (int i = 1; i < n - 1; i++) {
      result += Math.min(bList.get(i - 1), bList.get(i));
    }
    System.out.println(result);
  }
}
