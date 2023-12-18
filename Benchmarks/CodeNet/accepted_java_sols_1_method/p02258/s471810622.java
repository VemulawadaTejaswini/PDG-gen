import java.io.*;
import java.util.*;

public class Main{	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int min = scan.nextInt();
		int max = -1000000000;
		
		for(int i = 1; i < n; i++)
		{
			int r = scan.nextInt();
			
			if(r - min > max)
				max = r - min;
			
			if(r<min)
				min = r;
		}
	
		System.out.println(max);
	}	
}
