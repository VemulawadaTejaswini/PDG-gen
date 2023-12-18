import java.util.Scanner;
public class Main{
public static void main(String [] args)
{
 
    Scanner sc = new Scanner(System.in);
  	System.out.println("Enter the the value for n");
    int n = sc.nextInt();
  
  	if(n < 1 || n > 10000)
    {
    	System.exit(1);
    }
  
    int change = n % 1000;
  	System.out.println(change);
}
}
