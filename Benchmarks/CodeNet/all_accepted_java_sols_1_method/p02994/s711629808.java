import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int L = Integer.parseInt(sc.next());
    int data[] = new int[N];
    int sum = 0;
    int min = Integer.MAX_VALUE;
    for (int i=0; i<N; i++) {
      data[i] = L + i;
      sum += data[i];
      if (Math.abs(min) > Math.abs(data[i])) {
        min = data[i];
      }
    }
    System.out.println(sum - min);
  }
}