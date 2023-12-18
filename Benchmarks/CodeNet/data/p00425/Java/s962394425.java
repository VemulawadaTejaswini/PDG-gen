import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int dice[] = {0,1,2,3,5,4,6};
			int sum=1;
			int n=in.nextInt();
			if(n==0)
				return;
			while(n-->0)
			{
				int dice2[]=new int[7];
				String st=in.next();
				if(st.equals("North"))
				{
					dice2[4]=dice[1];
					dice2[1]=dice[2];
					dice2[3]=dice[3];
					dice2[6]=dice[4];
					dice2[5]=dice[5];
					dice2[2]=dice[6];

					dice[1]=dice2[1];
					dice[2]=dice2[2];
					dice[3]=dice2[3];
					dice[5]=dice2[5];
					dice[4]=dice2[4];
					dice[6]=dice2[6];
					sum+=dice[1];
				}
				if(st.equals("East"))
				{
					dice2[3]=dice[1];
					dice2[2]=dice[2];
					dice2[6]=dice[3];
					dice2[4]=dice[4];
					dice2[1]=dice[5];
					dice2[5]=dice[6];

					dice[1]=dice2[1];
					dice[2]=dice2[2];
					dice[3]=dice2[3];
					dice[5]=dice2[5];
					dice[4]=dice2[4];
					dice[6]=dice2[6];
					sum+=dice[1];
				}
				if(st.equals("West"))
				{
					dice2[5]=dice[1];
					dice2[2]=dice[2];
					dice2[1]=dice[3];
					dice2[4]=dice[4];
					dice2[6]=dice[5];
					dice2[3]=dice[6];

					dice[1]=dice2[1];
					dice[2]=dice2[2];
					dice[3]=dice2[3];
					dice[5]=dice2[5];
					dice[4]=dice2[4];
					dice[6]=dice2[6];
					sum+=dice[1];
				}
				if(st.equals("South"))
				{
					dice2[2]=dice[1];
					dice2[6]=dice[2];
					dice2[3]=dice[3];
					dice2[1]=dice[4];
					dice2[5]=dice[5];
					dice2[4]=dice[6];

					dice[1]=dice2[1];
					dice[2]=dice2[2];
					dice[3]=dice2[3];
					dice[5]=dice2[5];
					dice[4]=dice2[4];
					dice[6]=dice2[6];
					sum+=dice[1];
				}
				if(st.equals("Right"))
				{
					dice2[1]=dice[1];
					dice2[5]=dice[2];
					dice2[2]=dice[3];
					dice2[3]=dice[4];
					dice2[4]=dice[5];
					dice2[6]=dice[6];

					dice[1]=dice2[1];
					dice[2]=dice2[2];
					dice[3]=dice2[3];
					dice[5]=dice2[5];
					dice[4]=dice2[4];
					dice[6]=dice2[6];
					sum+=dice[1];
				}
				if(st.equals("Left"))
				{
					dice2[1]=dice[1];
					dice2[3]=dice[2];
					dice2[4]=dice[3];
					dice2[5]=dice[4];
					dice2[2]=dice[5];
					dice2[6]=dice[6];

					dice[1]=dice2[1];
					dice[2]=dice2[2];
					dice[3]=dice2[3];
					dice[5]=dice2[5];
					dice[4]=dice2[4];
					dice[6]=dice2[6];
					sum+=dice[1];
				}
			}
			System.out.println(sum);
		}
	}
}