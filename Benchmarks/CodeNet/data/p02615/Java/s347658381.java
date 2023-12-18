import java.util.*;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] v=new int[n];
		int sum=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int ans=0;
		ans+=a[n-1];
		
		int index=n-2;
		for(int i=1;i<n-1;i++) {
			ans+=a[index];
			i++;
			if(i<n-1) {
				ans+=a[index];
			}
			index--;
		}
		
	    System.out.println(ans);
	}
}
