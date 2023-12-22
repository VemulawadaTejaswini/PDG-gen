import java.util.Scanner;
public class Main
{
 	public static void main(String[] args)
    {
     	 Scanner sc = new Scanner(System.in);
      	String[] sep = sc.nextLine().split(" ");
      	int n = Integer.parseInt(sep[0]); 
  		int m = Integer.parseInt(sep[1]);
  		System.out.println( n * (n - 1) / 2 + m * (m - 1) / 2 );
    }
  
}