import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		int max=a[0];
		
		long step=0;
		for(int i : a)
		{
			max=Math.max(i, max);
			step+=max-i;
		}
		System.out.println(step);
	}

}
