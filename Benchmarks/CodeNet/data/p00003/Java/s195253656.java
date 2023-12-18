import java.util.Scanner;
public class dua {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int testCase = scan.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			if (c*c==a*a+b*b)
			{
				System.out.println("YES");
			}
			else if (b*b==a*a+c*c)
			{
				System.out.println("YES");
			}
			else if (a*a==c*c+b*b)
			{
				System.out.println("YES");
			}
			else 
			{
				System.out.println("NO");
			}
		}}}
			