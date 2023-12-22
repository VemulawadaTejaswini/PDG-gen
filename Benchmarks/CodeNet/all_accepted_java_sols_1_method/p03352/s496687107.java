import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int max =0;
    for (int i=1; i<= X; i++) {
      for (int j=2; j<= 10; j++) {
        int sum = (int)Math.pow(i,j);
        if (sum <= X) {
          max = Math.max(sum,max);
        }
      }
    }
    System.out.println(max);
  }
}