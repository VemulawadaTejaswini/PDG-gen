import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt(),count=0;;
		int[] a=new int[n];
		int[] tem=new int[a.length];
		
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
			tem[i]=a[i];
		}
		Arrays.sort(tem);	
          
		for(int i=0;i<n;i++)
			if(a[i] != tem[i]) count++;
			
		if(count <=2) 
			System.out.println("YES");
		else
			System.out.println("NO");	
		
	}
}


