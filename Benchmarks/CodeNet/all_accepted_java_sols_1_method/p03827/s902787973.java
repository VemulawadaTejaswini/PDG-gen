
import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String st=sc.nextLine();
		int x=0;
		int ans=0;
		for(int i=0;i<n;i++)
		{
			if(st.charAt(i)=='I') x++;
			else x--;
			ans=Math.max(ans, x);
		}
		System.out.println(ans);
	}

}
