import java.util.*;

public class aoj0002 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			while(sc.hasNext())
			{
				int a = sc.nextInt();
				int b = sc.nextInt();
				int count = 0;
					for(int i=0; i!=Integer.toString(a+b).length();i++)
					{
						count++;
					}
				System.out.println(count);
			}
	}
}