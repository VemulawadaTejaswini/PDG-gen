import java.util.*;
public class Main {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int H = sc.nextInt(), W = sc.nextInt();
      int ans = (H-1)*(W-1);
      
      System.out.println(ans);
    }
}