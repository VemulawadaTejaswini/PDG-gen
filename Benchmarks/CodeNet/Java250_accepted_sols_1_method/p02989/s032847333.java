import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		int m=a.length/2;
		if(a[m]==a[m-1])
			System.out.println("0");
		else{
			if(a[m-1]!=a[m])
				System.out.println(a[m]-a[m-1]);
		}
	}
}