import java.util.*;

public class Main{
		
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		String a[]=new String[n];
		for(int i=0;i<n;i++)
			a[i]=input.next();
		Arrays.sort(a);
		for(int i=0;i<n;i++)
			System.out.print(a[i]);
	}
}