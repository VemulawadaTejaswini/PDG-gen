import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner in = new Scanner(System.in);
		int week = in.nextInt();
		int dept = 100000;
		
		for (int i = 0; i < week; i++) {
			// 利子の計算
			dept = (int)(dept * 1.05);
			// 1,000円未満は切り上げ
			if (dept % 1000 != 0) {
				dept = (dept / 1000) * 1000;
				dept += 1000;
			}
		}
		
		System.out.println(dept);
		
	}
}