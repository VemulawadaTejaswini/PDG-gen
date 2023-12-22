import java.util.Scanner;
class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  
  int tate = sc.nextInt();
  int yoko = sc.nextInt();
  int a = tate*yoko;
  int b = tate*2+yoko*2;
  System.out.println(a+" "+b);
  }
}
