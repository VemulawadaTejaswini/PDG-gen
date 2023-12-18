import java.util.Scanner;
class Main{
  public static void main(String args[]){
    int a;
    Scanner s = new Scanner(System.in);
    a = s.nextInt();
    System.out.println(a + a*a + a*a*a);
  }
}