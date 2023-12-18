import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int x=scan.nextInt();
		int [] a=new int[x];
		ArrayList a1=new ArrayList();
		ArrayList a2=new ArrayList();
		for(int i=0;i<x;i++)
		{
			a[i]=scan.nextInt();
			a1.add(a[i]);
		}
		Arrays.sort(a);
		int b=n;
		
		while(a.length>0&&b>a[0])
		{
			
			b--;
			if(a1.contains(b))
			{
				continue;
			}
			else
			{
				a2.add(b);
				break;
			}
		}
		while(true)
		{
			b++;
			if(a1.contains(b))
			{
				continue;
			}
			else
			{
				a2.add(b);
				break;
			}
		}
		if(a.length==0) System.out.println(n);
		else System.out.println(Collections.min(a2));
		
	}

}
