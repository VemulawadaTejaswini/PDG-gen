
import java.util.Scanner;

class Main 
{
	
	public static void main(String[] args) 
	{
		//args = new String[] {"3","abcbdab","bdcaba","abc","abc","abc","bc"};
		String[] in = readIn();
//		System.out.println(in.length);
		for(int i=0; i<in.length;i+=2)
		{
			//System.out.println(in[i]+", "+in[i+1]);
			runLCS(in[i],in[i+1]);
		}
	}
	
	public static String[] readIn()
	{
		Scanner scn = new Scanner(System.in);
		String[] temp = new String[Integer.parseInt(scn.nextLine())*2];
//		int i=0;
//		while(true)
//		{
//			temp[i]=scn.nextLine();
//			if(i==23)
//			{
//				break;
//			}
//			i++;
//		}
		for(int i=0;i<temp.length;i++)
		{
			//System.out.println("here");
//			if(i==temp.length-1)
//			{
//				System.out.println(temp.length+", "+i);
//				//break;
//			}
			temp[i]=scn.nextLine();
			
			//System.out.println(temp[i]);
		}
		scn.close();
		return temp;
	}
	
	public static void runLCS(String s1, String s2)
	{
		int[][] LongComSub = new int[s1.length()][s2.length()];
		//System.out.println(LongComSub.length);
		for(int i=0;i<LongComSub.length;i++)
		{
			for(int j=0;j<LongComSub[0].length;j++)
			{
				
				if(i==0 || j==0)
				{
					if(s1.charAt(i)==(s2.charAt(j)))
					{
						LongComSub[i][j] = 1;
					}
					else if(i==0 && j>0)
					{
						LongComSub[i][j]=LongComSub[i][j-1];
					} 
					else if(j==0 && i>0)
					{
						LongComSub[i][j]=LongComSub[i-1][j];
					}
					else
					{
						LongComSub[i][j] = 0;
					}
				}
				else if(s1.charAt(i)==s2.charAt(j))
				{
					LongComSub[i][j] = 1+LongComSub[i-1][j-1];
				}
				else
				{
					LongComSub[i][j]=Math.max(LongComSub[i-1][j], LongComSub[i][j-1]);
				}
//				System.out.print(LongComSub[i][j]+", ");
			}
//			System.out.println();
		}
		System.out.println(LongComSub[LongComSub.length-1][LongComSub[0].length-1]);
	}

}

