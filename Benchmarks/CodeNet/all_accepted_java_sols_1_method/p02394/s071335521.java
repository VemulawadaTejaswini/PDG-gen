import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int w = sc.nextInt();
    int h = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int r = sc.nextInt();
    String ans = "No";

    if(x - r >= 0 && x + r <= w && y - r >= 0 && y + r <= h){
      ans = "Yes";
    }

    System.out.println(ans);
  }
}

