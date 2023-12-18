import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s=scan.next();
		
		if(n==1) {
			System.out.println(0);
			return;
		}
		//how many west from 0...i
		//how many east from i...n-1
		int[] west=new int[n];
		int[] east=new int[n];
		
		if(s.charAt(0)=='W') west[0]++;
		if(s.charAt(n-1)=='E') east[n-1]++;
		
		for(int i=1;i<n;i++) {
			west[i]=west[i-1];
			if(s.charAt(i)=='W') west[i]++;
		}
		
		for(int i=n-2;i>=0;i--) {
			east[i]=east[i+1];
			if(s.charAt(i)=='E') east[i]++;
		}
//		System.out.println(Arrays.toString(west));
//		System.out.println(Arrays.toString(east));
		
		int res=west[n-1];
		if(n>1) res=Math.min(res,east[1]);
		
		for(int i=1;i<n-1;i++) {
			res=Math.min(res,west[i-1]+east[i+1]);
		}
		System.out.println(res);
	}
}