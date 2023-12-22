import java.util.*;
public class Main{
  public static void main(String[] augs){
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int max_hight = 0;
    int n = sc.nextInt();
    
    for (int i=1; i<=n; i++){
      int h = sc.nextInt();
      if (h >= max_hight){
        max_hight = h;
        count++;
      }
    }
    
    System.out.println(count);
  }
}