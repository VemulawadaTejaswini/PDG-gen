import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    while(true){
      c = c - b;
      if(c<1){
        System.out.println("Yes");
        return;
      }
      a = a - d;
      if(a<1){
        System.out.println("No");
        return;
      }
    }





  }
}