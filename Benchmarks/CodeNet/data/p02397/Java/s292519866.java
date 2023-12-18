import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,b,c;
    while((a = sc.nextInt()) != 0 | (b = sc.nextInt()) != 0){
      if(a > b){
        c = a;
        a = b;
        b = c;
      }
      System.out.println(a + " " + b);
    }
    sc.close();
  }
}

