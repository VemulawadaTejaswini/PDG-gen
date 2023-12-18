import java.util.*;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int sum=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
	   
		Arrays.sort(a);
		
	    System.out.println(sum-a[0]);
	}
}
