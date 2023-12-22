
import java.util.*;

public class Main {
	 
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt(),m=cin.nextInt(),l=cin.nextInt();
		Long A[][]=new Long[100][100],B[][]=new Long[100][100];
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				A[i][j]=cin.nextLong();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<l;j++) {
				B[i][j]=cin.nextLong();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<l;j++) {
				Long sum=(long) 0;
				for(int k=0;k<m;k++) {
					sum+=A[i][k]*B[k][j];
				}
				if(j!=l-1)System.out.print(sum+" ");
				else System.out.println(sum);
			}
		}
		
	}
	
}
