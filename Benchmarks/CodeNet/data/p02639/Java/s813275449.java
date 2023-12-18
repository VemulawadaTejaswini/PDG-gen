import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in); 
    int n  = 5;
    int r = 0;
    
    for(int i = 0; i < n; i++)
    {
    	a[i] = sc.nextInt();
    	if(a[i] == 0)
    	{
    		r = i + 1;
    	}
    }
    System.out.println(r);

  }
}                          
