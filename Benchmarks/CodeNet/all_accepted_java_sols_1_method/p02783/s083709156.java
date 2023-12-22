import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    int h = stdIn.nextInt();
    int a = stdIn.nextInt();
   
    if (h % a == 0) {
      System.out.println(h / a);
    } else {
      System.out.println(h / a + 1);
    }
  }
}
