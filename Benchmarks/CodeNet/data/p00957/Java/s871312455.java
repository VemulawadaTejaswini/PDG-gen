import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	static int l;
	static int k;
	static int ans = 0;
	
	static void fill(int curh, int lastcolor)
	{
		if(curh > l) {return;} //too tall
		
		if(curh == 0)
		{
			fill(curh+1, 1); //thin black
			fill(curh+k, 1); //thicc black
			return;
		}
		else
		{
			//if last was black, it could also end now.
			if(lastcolor == 1)
			{
				ans += 1;
			}
			
			if(lastcolor == 0)
			{ //last was white
				fill(curh+1, 1); //thin black
				fill(curh+k, 1); //thicc black
				return;
			}
			else if(lastcolor == 1)
			{
				fill(curh+1, 0); //thin white
				return;
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		l = scan.nextInt(); //height
		k = scan.nextInt(); //thicc
		
		fill(0, -1);
		
		System.out.println(ans);
	}

}

