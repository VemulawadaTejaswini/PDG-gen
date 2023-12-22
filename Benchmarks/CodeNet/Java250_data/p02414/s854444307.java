import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,j,k;
		String[] nm=br.readLine().split(" ");
		int n=Integer.parseInt(nm[0]);
		int m=Integer.parseInt(nm[1]);
		int l=Integer.parseInt(nm[2]);
		
		int[][] A=new int[n][m];
		int[][] B=new int[m][l];
		long[][] C=new long[n][l];
		
		for(i=0;i<n;i++){
			String[] numA=br.readLine().split(" ");
			for(j=0;j<m;j++){
				A[i][j]=Integer.parseInt(numA[j]);
			}
		}
		for(j=0;j<m;j++){
			String[] numB=br.readLine().split(" ");
			for(k=0;k<l;k++){
				B[j][k]=Integer.parseInt(numB[k]);
				for(i=0;i<n;i++){
					C[i][k]+=(A[i][j])*(B[j][k]);
				}
			}
		}
		for(i=0;i<n;i++){
			for(k=0;k<l;k++){
				System.out.print(C[i][k]);
				if(k==l-1){
					System.out.println();
				}
				else{
					System.out.print(" ");
				}
			}
		}
	}
}