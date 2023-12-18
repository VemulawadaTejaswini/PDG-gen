import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		while(N-->0)
		{
			String s[]=in.next().split(":");
			double S=Double.valueOf(s[0]);
			double L=Double.valueOf(s[1]);
			S=360*(60*S+L)/720.0;
			L=360.0*L/60.0;
			double dif=Math.min(Math.abs(S-L), Math.abs(360-(S-L)));
			System.out.println(0<=dif&&dif<30 ? "alert":90<=dif&&dif<=180 ? "safe":"warning");
		}
	}
}