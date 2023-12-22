import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=stdIn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=stdIn.nextInt();
		}
		System.out.print(a[n-1]);
		for(int i=n-2;i>=0;i--)
			System.out.print(" "+a[i]);
		System.out.println("");
	}	
}