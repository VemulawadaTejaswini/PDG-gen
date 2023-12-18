import java.util.Scanner;

public class Main{
  public static void main(String args[]){

  Scanner stdId = new Scanner(System.in);
  int i = stdId.nextInt();
  int j = stdId.nextInt();

  System.out.println(i * j + " " + 2 * (i+j));

  }
}