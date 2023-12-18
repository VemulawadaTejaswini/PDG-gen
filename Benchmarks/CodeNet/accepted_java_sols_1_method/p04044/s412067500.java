//package AtCoder;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		String[] s=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		sc.close();
		Arrays.sort(s);
		for(int i=0;i<n;i++)
			System.out.print(s[i]);

	}

}
