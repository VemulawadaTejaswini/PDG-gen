import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int w=in.nextInt();
			int h=in.nextInt();
			if((w|h)==0)
				return;
			String state="U";
			int nh=1,nw=1;
			for(;;)
			{
				String s=in.next();
				if(s.equals("STOP"))
					break;
				
				if(s.equals("RIGHT"))
				{
					if(state.equals("U"))
						state="R";
					else if(state.equals("R"))
						state="D";
					else if(state.equals("D"))
						state="L";
					else if(state.equals("L"))
						state="U";
				}
				else if(s.equals("LEFT"))
				{
					if(state.equals("U"))
						state="L";
					else if(state.equals("L"))
						state="D";
					else if(state.equals("D"))
						state="R";
					else if(state.equals("R"))
						state="U";
				}
				else
				{
					int go=in.nextInt();
					if(s.equals("FORWARD"))
					{
						if(state.equals("U"))
							while(nh<=h&&go-->0)
								nh++;
						else if(state.equals("L"))
							while(nw>1&&go-->0)
								nw--;
						else if(state.equals("D"))
							while(nh>1&&go-->0)
								nh--;
						else if(state.equals("R"))
							while(nw<=w&&go-->0)
								nw++;	
					}
					else if(s.equals("BACKWARD"))
					{
						if(state.equals("U"))
							while(nh>1&&go-->0)
								nh--;
						else if(state.equals("L"))
							while(nw<=w&&go-->0)
								nw++;
						else if(state.equals("D"))
							while(nh<=h&&go-->0)
								nh++;
						else if(state.equals("R"))
							while(nw>1&&go-->0)
								nw--;	
					}
				}
			}
			System.out.println(nw+" "+nh);
		}
	}
}