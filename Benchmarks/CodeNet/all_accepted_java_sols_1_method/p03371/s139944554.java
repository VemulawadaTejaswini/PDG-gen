import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt() * 2;
    int x = sc.nextInt();
    int y = sc.nextInt();
    int total = a * x + b * y;
    while(x>0&&y>0){
      total = Math.min(total,total -a -b +c);
      x--;
      y--;
    }
    while(x>0){
      total = Math.min(total,total -a +c);
      x--;
    }
    while(y>0){
      total = Math.min(total,total -b +c);
      y--;
    }
    System.out.println(total);
  }
}
