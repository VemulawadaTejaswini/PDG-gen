import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    System.out.printf("%d %d %.5f\n",x/y,x%y,(double)x/y);
  }
}