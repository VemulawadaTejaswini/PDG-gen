import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int i,j;
		String[] nm=br.readLine().split(" ");
		int n=Integer.parseInt(nm[0]);
		int m=Integer.parseInt(nm[1]);
		
		int[][] A=new int[n][m];
		int[] b=new int[m];
		int []c=new int[n];
		
		for(i=0;i<n;i++){
			String[] numA=br.readLine().split(" ");
			for(j=0;j<m;j++){
				A[i][j]=Integer.parseInt(numA[j]);
			}
		}
		for(j=0;j<m;j++){
			String numB=br.readLine();
			b[j]=Integer.parseInt(numB);
			for(i=0;i<n;i++){
				c[i]+=(A[i][j])*(b[j]);
				sb.append(c[i]+"\n");
			}
		}
		System.out.print(sb);
	}
}