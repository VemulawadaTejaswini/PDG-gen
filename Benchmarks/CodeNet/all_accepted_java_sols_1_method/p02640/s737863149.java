import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(2*x<=y && y <= 4*x && y%2 == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
