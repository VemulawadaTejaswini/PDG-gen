import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int w = Math.abs(a-x);
    int y = Math.abs(b-x);
    if(w<y){
      System.out.println("A");
    }else{
      System.out.println("B");
    }
  }
}
