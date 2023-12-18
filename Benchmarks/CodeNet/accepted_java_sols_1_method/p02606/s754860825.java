import java.util.*;

 
public class Main {
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt();
    int R = sc.nextInt();
    int d = sc.nextInt();
    double defValue = Math.ceil( ((double)L) / ((double)d));
    
    
    int i = (int)defValue;
    while(i * d <= R)
    {
 		i++;
    }
    
        System.out.println( (int)( i -  defValue) );
      
  }
}