import java.util.*;
 
public class Main
{
  public static void main(String[] args)
  {
    Scanner scan1 = new Scanner(System.in);
	String firstColor = scan1.next();
    String secondColor = scan1.next();
    
    scan1.nextLine();
 
	int redCount = scan1.nextInt();
	int blueCount = scan1.nextInt();
 
	String subtract = scan1.next();
 
	if(subtract.equals(firstColor))
	{
 	 redCount-=1;
	}
	else
    {
 	 blueCount-=1;
    }
 
	System.out.println(redCount + " " + blueCount);
  }
}