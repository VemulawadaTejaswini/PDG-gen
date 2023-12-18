import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int trial = sc.nextInt();
		int tPoint = 0;
		int hPoint = 0;
		for(int i = 0; i < trial; ++i)
		{
			String Taro = sc.next();
			String Hanako = sc.next();
			if(Taro.compareTo(Hanako) < 0)
			{
				hPoint += 3;
			}
			else if(Taro.compareTo(Hanako) == 0)
			{
				++tPoint;
				++hPoint;
			}
			else
			{
				tPoint += 3;
			}
		}
		System.out.println(tPoint + " " + hPoint);
	}
}