import java.util.*;

public class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int count=0,non=1;
	while((a>0)&&(b>0))
	{
		if(non>=b)
		{
			break;
		}
		else
		{
			non=non-1+a;
			count++;
		}
	}
	System.out.println(count);
  }
}
		