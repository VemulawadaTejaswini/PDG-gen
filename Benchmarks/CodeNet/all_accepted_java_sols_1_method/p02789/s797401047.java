import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    
    int n = stdIn.nextInt();
    int m = stdIn.nextInt();
    
    if (n <= m) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
