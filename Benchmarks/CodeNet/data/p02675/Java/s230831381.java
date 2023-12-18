import java.util.*;

public class Main{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
  int k=sc.nextInt();
  String s=sc.next();
  
  if(s.length()<=k)
    System.out.println(s);
  
  else
  {
		s=s.substr(0,k) +"...";
      System.out.print(s);
    
  }
  
 
}
}
