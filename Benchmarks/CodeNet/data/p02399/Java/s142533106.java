import java.util.Scanner;

public class main{
  
  public static void main(String[] args) {
    
    Scanner sin = new Scanner(System.in);

    int a = sin.nextInt();
    int b = sin.nextInt();

    System.out.println(a/b + " " + a % b +" " + Double.valueOf((double)a / (double)b));
  }
}
