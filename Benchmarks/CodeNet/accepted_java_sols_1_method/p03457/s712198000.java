import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int px = 0, py = 0, pt = 0;
    for(int i = 0; i < n; i++){
      int t = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int sum = Math.abs(x-px) + Math.abs(y-py);
      if((t - pt) % 2 != sum % 2 || sum > t - pt){
        System.out.println("No");
        System.exit(0);
      }
      px = x;
      py = y;
      pt = t;
    }
    System.out.println("Yes");
  }
}