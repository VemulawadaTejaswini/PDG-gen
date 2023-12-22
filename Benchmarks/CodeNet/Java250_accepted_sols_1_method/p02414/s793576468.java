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
		int l=stdIn.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[m][l];
		int i,j,k;
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				a[i][j]=stdIn.nextInt();
		for(i=0;i<m;i++)
			for(j=0;j<l;j++)
				b[i][j]=stdIn.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<l;j++){
				long c=0;
				if(j>0)
					System.out.print(" ");
				for(k=0;k<m;k++)
					c+=a[i][k]*b[k][j];
				System.out.print(c);
			}
			System.out.println("");
		}
		
	}
}