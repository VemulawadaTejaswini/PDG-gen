import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
    {
     	 Scanner sc = new Scanner(System.in);
      	
     	String[] sep = sc.nextLine().split(" ");
      	long n = Long.parseLong(sep[0]);
      	long k = Long.parseLong(sep[1]);
      	
      	Long min = n % k;
      	if(min > (k - min))
        {
         	System.out.println(k - min); 
        }else{
         	System.out.println(min); 
        }
    }
}