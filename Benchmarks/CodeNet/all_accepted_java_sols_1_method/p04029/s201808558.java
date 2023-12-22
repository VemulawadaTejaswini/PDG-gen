import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int total = 0;
    
    for (int i = n; n > 0; n --) {
      total += n;
    }
    
    System.out.println(total);
  }
}