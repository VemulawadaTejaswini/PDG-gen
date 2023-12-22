import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int count_1 = 0;
    int count_2 = 0;
    for(int i = 0; i < m; i++) {
      int next = sc.nextInt();
      if(x > next) count_2++;
      if(x < next) count_1++;
    }
    System.out.println(Math.min(count_1, count_2));
  }
}