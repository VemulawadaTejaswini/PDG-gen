import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    
    int a = stdIn.nextInt();
    int b = stdIn.nextInt();
    int c = stdIn.nextInt();
    
    int a2 = a;
    int b2 = b;
    int c2 = c;
    
    a = b;
    b = a2;

    int a3 = a;
    int b3 = b;
    int c3 = c;
    a = c3;
    c = a3;
    
    System.out.println(a + " " + b + " " + c);
  }
}