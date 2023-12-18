import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Stack;

public class Main {
	static Scanner scn = new Scanner(System.in);
	static int max=Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int n,k,sum=0,max=0,j=0;
			n=scn.nextInt();
			k=scn.nextInt();
			sum=n*k;
			if(n>9||k>9)
			{
				System.out.println("-1");
			}
			else 
				System.out.println(sum);
		
	}
	
}
