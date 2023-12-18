import java.util.Scanner;

public class Main 	
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String st;
		st = sc.next();
		//System.out.println(st);
		int l = st.length();
		if(l==2)
			System.out.println(st);
		else
		{
			char a[] = st.toCharArray();
			//System.out.println(a[2]);
			String st2 = "";
			st2=st2+a[2];
			st2=st2+a[1];
			st2=st2+a[0];
			System.out.println(st2);
		}
	}
}
