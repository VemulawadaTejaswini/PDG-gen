import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    if(n == 1)
      System.out.println("Hello World");
    else 
      System.out.println(s.nextInt() + s.nextInt());
  }

}