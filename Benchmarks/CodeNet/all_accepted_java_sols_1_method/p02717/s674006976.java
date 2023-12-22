import java.util.Scanner;

public class Main{
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
    int X = scanner.nextInt();
    int Y = scanner.nextInt();
    int Z = scanner.nextInt();
    
    int d = X;
    X = Y;
    Y = d;
    
    d = Z;
    Z = X;
    X = d;
    
    System.out.println(X + " " + Y + " " + Z + " ");
  }
}