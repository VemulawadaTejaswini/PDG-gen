import java.util.*;

class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    float sum = 0;
    if (n == 1) {
      System.out.println(sc.nextInt());
      return;
    }

    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      sum += (float)1/num;
    }
    float result = 1/sum;
    System.out.println(result);
  }
}