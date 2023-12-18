import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    
    int max = 0;

    max = Math.max(Math.max(a*c,a*d),Math.max(b*c,b*d));
    
    System.out.println(max);

  }
}