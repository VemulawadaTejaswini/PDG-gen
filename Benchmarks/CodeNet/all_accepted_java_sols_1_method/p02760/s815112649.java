import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A[][],B[][];
		A= new int [3][3];
		B= new int [3][3];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				A[i][j]= sc.nextInt();
				B[i][j]=0;
			}
		}
		int N ;
		N= sc.nextInt();
		for (int i=0;i<N;i++) {
			int c =sc.nextInt();
			for (int j=0;j<3;j++) {
				for (int k=0;k<3;k++) {
					if(A[j][k]==c) {
						B[j][k]=1;
					}
				}
			}
		}
		for (int i=0;i<3;i++) {
			if(B[i][0]==1&&B[i][1]==1&&B[i][2]==1) {
				System.out.println("Yes");
				return;
			}
		}
		for (int i=0;i<3;i++) {
			if(B[0][i]==1&&B[1][i]==1&&B[2][i]==1) {
				System.out.println("Yes");
				return;
			}
		}
		if(B[0][0]==1&&B[1][1]==1&&B[2][2]==1) {
			System.out.println("Yes");
			return;
		}
		if(B[2][0]==1&&B[1][1]==1&&B[0][2]==1) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
}