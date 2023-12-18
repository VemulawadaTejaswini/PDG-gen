import java.util.Scanner;
public class Main{
public static void main(String [] args)
{
 
    Scanner sc = new Scanner(System.in);
  	System.out.println("Enter the the value for n");
    double userInput = sc.nextDouble();
  
  	System.out.println(userInput%1000);
}
}
