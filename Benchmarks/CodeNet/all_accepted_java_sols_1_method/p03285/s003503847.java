import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int maxCnt = n / 4;
      for(int k = 0; k <= maxCnt; k++) {
        int diff = n - k * 4;
        if(diff % 7 == 0) {
            System.out.println("Yes");
            return;
        }
      }
      System.out.println("No");
  }
}