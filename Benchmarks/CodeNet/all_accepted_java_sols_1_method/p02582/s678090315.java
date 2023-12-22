
import java.util.*;

public class Main {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int max=0;
		for(int i=0;i<3;i++)
		{
			int j=i,count=0;
			while(j<3&&st.charAt(j)=='R') 
				{
					count++;
					j++;
				}
			max=Math.max(max, count);
		}
		System.out.println(max);
	}
	
}
