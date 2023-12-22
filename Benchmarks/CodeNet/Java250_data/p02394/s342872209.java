import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		int w,h,x,y,r;
		w=in.nextInt();
		h=in.nextInt();
		x=in.nextInt();
		y=in.nextInt();
		r=in.nextInt();
		
		if( ((x+r)>w) || ((x-r) < 0) || ((y+r) > h) || ((y-r)<0))
			System.out.println("No");
		else {
			System.out.println("Yes");
		}
	}

}