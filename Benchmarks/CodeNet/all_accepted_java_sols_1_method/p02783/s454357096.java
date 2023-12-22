import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int a = sc.nextInt();
    int ans = 0;
    if (h % a == 0) {
    	ans = h/a;
    } else {
    	ans = h/a + 1;
    }
    System.out.println(ans);
  }
}

