import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    int sum;

    if (a<=k) {
      if (b<=k-a) {
        c = k-a-b;
        sum = a-c;
      } else {
        sum = a;
      }
    } else {
      sum = k;
    }

	System.out.println(sum);
  }
}
