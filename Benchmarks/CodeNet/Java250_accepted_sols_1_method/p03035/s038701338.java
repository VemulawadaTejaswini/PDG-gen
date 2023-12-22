import java.util.Scanner;

public class Main
{
  public static void main(String []args)
  {
	int n,b;
   	Scanner sc= new Scanner(System.in);
   	n= sc.nextInt();
   	b=sc.nextInt();
    
   	if(n>=13)
    {
		System.out.println(b);
    }
    
    else if(n>5 && n<13)
    {
		System.out.println(b/2);
    }
    
    else 
    {
		System.out.println("0");
    }

  }
  
  
  
}
