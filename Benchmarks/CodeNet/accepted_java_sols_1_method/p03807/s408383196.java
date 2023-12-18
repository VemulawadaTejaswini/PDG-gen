import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;


public class Main {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
	
	
		
		int n=sc.nextInt();
		
		int cnt=0;
			
		for(int i=0;i<n;i++)
		{	
		int s=sc.nextInt();
		if(s%2!=0)
			cnt++;
		}
		
		
	if(cnt%2!=0)	
	{
	System.out.println("NO");	
	}
	else 
		System.out.println("YES");
	}
	
}

