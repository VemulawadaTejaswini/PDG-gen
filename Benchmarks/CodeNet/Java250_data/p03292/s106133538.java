import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char arr[] = new char[s.length()];
		arr = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(arr[i]==' ')
				arr[i]=',';
		}
		String ss = new String(arr);
		// System.out.println(ss);
		// int n = sc.nextInt();
		// System.out.println(0);
		// String s = sc.next();
		String sarr[] = ss.split(",");
		int aarr[] = new int[sarr.length];
		// sarr[] = ;
		// System.out.println("fghj");
		for(int i=0;i<sarr.length;i++)
			aarr[i]=Integer.parseInt(sarr[i]);
		Arrays.sort(aarr);
		
		int count = 0;
		for(int i=sarr.length - 1;i>0;i--)
			count+= aarr[i]-aarr[i-1];

		System.out.println(count);
	}
}