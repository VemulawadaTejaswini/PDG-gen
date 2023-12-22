import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();
      
    int tu = y-2*x;
    int ka = 4*x-y;

    if(tu>=0 && ka>=0 && tu%2==0 && ka%2==0) System.out.println("Yes");
    else System.out.println("No");

  }
}