import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    for (int i=0;i<m;i++){
      int k = scan.nextInt();
      n -= k;
      if (n<=0){
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
