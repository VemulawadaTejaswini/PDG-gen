import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=stdIn.nextInt();
		int m=stdIn.nextInt();
		int a[][]=new int[n][m];
		int b[]=new int[m];
		int c[]=new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				a[i][j]=stdIn.nextInt();
		}
		for(int i=0;i<m;i++)
			b[i]=stdIn.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				c[i]+=a[i][j]*b[j];
		}
		for(int i=0;i<n;i++)
			System.out.println(c[i]);
	}
}