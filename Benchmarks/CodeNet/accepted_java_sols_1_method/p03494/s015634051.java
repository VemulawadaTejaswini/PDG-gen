import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    int result = Integer.MAX_VALUE;
    for(int i = 0; i < n; i++) {
      int val = sc.nextInt();
      if(val % 2 > 0) {
        result = 0;
        break;
      }
      
      int times = 0;
      while(val % 2 == 0) {
        times++;
        val /= 2;
      }
      result = (times < result) ? times : result;
    }
    System.out.println(result);
  }
}