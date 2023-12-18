import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    float ans;
    if((Integer.parseInt(N) % 2) == 0){
      ans = (float)(Integer.parseInt(N) / 2) / Integer.parseInt(N);
    } else {
      ans = (float)((Integer.parseInt(N) / 2) + 1) / Integer.parseInt(N);
    }
    
    System.out.println(String.format("%.10f", ans));
  }
}
