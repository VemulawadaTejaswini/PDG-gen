import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int n =Integer.parseInt(line[0]);
		int m =Integer.parseInt(line[1]);
		int l =Integer.parseInt(line[2]);
		int A =new int[n][m];
		int B =new int[m][l];
		int C =new int[n][l];
	//A	
		for(int i=0;i<n;i++){
			String[] input = sc.nextLine();
			for(int j=0;j<m;j++){
				A[i][j]=Integer.parseInt(input[j]);
			}
		}
	//B	
		for(int i=0;i<m;i++){
			String[] input= sc.nextLine();
			for(int j=0;j<l;j++){
				B[i][j]=Integer.parseInt(input[j]);
			}
		}
	//C
		for(int i=0;i<n;i++){
			for(int j=0;j<l;l++){
				for(int k=0;k<m;k++){
					C[i][j]=A[i][k]*B[k][j];
				}
			}
		}
	//System.out	
		for(int i=0;i<n;i++){
			for(int j=0;j<l-1;j++){
				System.out.print(C[i][j]+" ");
			}
			System.out.println(C[i][l-1]);
		}
	}
}
		