import java.util.Scanner;

class C1_3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x,y;
    while(true){
      x = sc.nextInt();
      y = sc.nextInt();
      if(x == 0 && y == 0){
        break;
      }
      System.out.println(x + " " + y);
    }
  }
}