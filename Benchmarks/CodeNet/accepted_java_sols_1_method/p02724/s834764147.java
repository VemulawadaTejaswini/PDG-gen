import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
    {
     	Scanner sc = new Scanner(System.in); 
      
      	long cash = sc.nextLong();
      	long result = (cash / 500) * 1000 + ((cash % 500) / 5) * 5;
      	System.out.println(result);
    }
}