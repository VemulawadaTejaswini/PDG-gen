import java.util.*;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		//int[] p=new int[n];
		
		int g1=0;int g2=0;int g3=0;
		
		for(int i=1;i<=n;i++) {
			int p=sc.nextInt();
			if(p<=a)g1++;
			else if(p<=b)g2++;
			else g3++;
		}
		
		
	    System.out.println(Math.min(g1, Math.min(g2, g3)));
	}
}
