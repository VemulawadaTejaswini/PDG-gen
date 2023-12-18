import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    int h = sc.nextInt();
    int w = sc.nextInt();
    for(int i=0;i<=w;i++){
      System.out.print("#");
    }
    System.out.println("#");
    for(int i=0;i<h;i++){
      System.out.println("#"+sc.next()+"#");
    }
    for(int i=0;i<=w;i++){
      System.out.print("#");
    }
    System.out.println("#");
  }
}