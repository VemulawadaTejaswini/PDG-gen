import java.util.*;

public class Main{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(1<=b && b<=a && a<=20 && 1<=c && c<=20){
      int x = a-b;
      int y = c-x;

      if(y<0){
        System.out.println(0);
      }else{
        System.out.println(y);
      }
    }

  }

}
