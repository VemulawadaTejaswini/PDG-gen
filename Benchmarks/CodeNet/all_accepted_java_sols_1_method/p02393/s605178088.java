import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int X;
    if(a > b) {
      X = a; a = b; b = X;
    }
    if(b > c) {
      X = b; b = c; c = X;
    }
    if(a > b) {
      X = a; a = b; b = X;
    } 
      System.out.println(a + " " + b + " " + c);
  }
}