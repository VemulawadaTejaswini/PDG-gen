import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n, sum;
    
    while(in.hasNext()) {
      int count = 0;
      n = in.nextInt();
      sum = in.nextInt();
      if (n == 0 && sum == 0) return;
      
      for (int i = 1; i < n -1; i++) {
        for (int j = i + 1; j < n; j++) {
          int rest = sum - i -j;
          if (rest > j && rest <= n) count++;
        }
      }
      System.out.println(count);
    }
  }
}
    