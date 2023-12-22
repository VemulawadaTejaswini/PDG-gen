import java.util.*;

class Main{
  
  public static void main(String [] args)
  {
 		Scanner sc  = new Scanner(System.in);
    	String F =sc.nextLine();
    	String C =sc.nextLine();
    	int count=0;
    	for(int i=0;i<F.length();i++)
        {
          Character c1 = F.charAt(i);
          Character c2 = C.charAt(i);
          
          if(c1==c2) count++;
        }
    
    System.out.println( count);
  }
  
}