import java.util.*;

public class Main
{
	public static void main(String ards[])
    {
    	Scanner sc=new Scanner(System.in);
      	int X=sc.nextInt();
      	int Y=sc.nextInt();
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