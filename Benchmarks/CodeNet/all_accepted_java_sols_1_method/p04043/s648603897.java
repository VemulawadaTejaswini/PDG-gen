import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int y=x.nextInt();
		int z=x.nextInt();
		int w=x.nextInt();
		if(y==5&&z==7&&w==5) {
			System.out.println("YES");
		}
		else if(y==7&&z==5&&w==5)
		{
			System.out.println("YES");
		}

		else if (y==5&&z==5&&w==7)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
}}}