import java.util.*;
 
public class Main
{
	public static void main(String ards[])
    {
    	Scanner sc=new Scanner(System.in);
      	int X=sc.nextInt();
      	int Y=sc.nextInt();
      	if(X==0||Y==0)
        {
       		System.out.println("No");
			return;
        }
      	int res=X*4;
      	while(res>Y)
        {
          	res-=2;
        }
      	if(res==Y)
      		System.out.println("Yes");
      	else
          	System.out.println("No");
    }
}