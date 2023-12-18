import java.util.Scanner;
public class Main
{
 	public static void main(String[] args)
    {
     	 Scanner sc = new Scanner(System.in);
      	String[] num = sc.nextLine().split(" ");
      	if(Integer.parseInt(num[0]) > Integer.parseInt(num[1]))
        {
         	System.out.println("safe"); 
        }else{
          	System.out.println("unsafe"); 
        }
    }
}