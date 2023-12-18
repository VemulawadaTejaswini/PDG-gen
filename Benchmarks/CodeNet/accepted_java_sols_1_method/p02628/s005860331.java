import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    sc.nextLine();
    int minTotalPrice = Arrays.stream(sc.nextLine().split(" "))
      .mapToInt(Integer::parseInt)
      .sorted()
      .limit(K) 
      .sum();
    System.out.println(minTotalPrice);
  }
}