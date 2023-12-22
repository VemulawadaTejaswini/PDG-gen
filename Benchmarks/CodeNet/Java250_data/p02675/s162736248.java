import java.util.Scanner;
 
class Main
{
  public static void main(String[] args)
  {
     int n,u;
		      Scanner sc = new Scanner(System.in);
		      n = sc.nextInt();
		      u = n%10;
		    if(u == 2 ||u == 4 ||u == 5 ||u == 7 ||u == 9 )
		    {
		      System.out.println("hon");
		    }
		    if(u == 0 ||u == 1 ||u == 6 ||u == 8 )
		    {
		      System.out.println("pon");
		    }
		    if(u == 3)
		    {
		      System.out.println("bon");
		    }
		  
    
  }
}
  