import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int a = stdIn.nextInt();
   
    if(a % 1000 == 0)
    System.out.print(0);
    
    else if(a % 1000 != 0)
      System.out.print(1000 - a % 1000);
  }
}