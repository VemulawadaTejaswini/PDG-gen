import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int k=in.nextInt();
		int a=in.nextInt();
		int b=in.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(i%k==0)
			{
				System.out.println("OK");
				System.exit(0);
			}
		}
		System.out.println("NG");

	}

}
