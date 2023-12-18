import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int d = b + c;

    if(d<=a){
      c = 0;
    }
    if(d>a){
      c = c - (a- b);
    }
    System.out.println(c);
  }
}
