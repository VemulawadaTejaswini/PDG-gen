import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 int m=sc.nextInt();
		 int l=sc.nextInt();
		 
		 long A[][]=new long[n][m];
		 long B[][]=new long[m][l];
		 
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<m;j++) {
				 A[i][j]=sc.nextLong();
			 }
		 }
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<l;j++) {
				 B[i][j]=sc.nextLong();
			 }
		 }
		 
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<l;j++) {
				 long ass=0;
				 for(int k=0;k<m;k++) {
					 ass +=A[i][k]*B[k][j];
				 }
				 System.out.print(ass);
				 if(j !=l-1) {
					 System.out.print(" ");
				 }	else {
					 System.out.println("");
				 }
				 
			 }
		 }
		 
		 sc.close();
	 }
}

