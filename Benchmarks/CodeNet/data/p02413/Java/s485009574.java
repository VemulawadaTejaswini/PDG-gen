import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,j;
		String[] rc=br.readLine().split(" ");
		int r=Integer.parseInt(rc[0]);
		int c=Integer.parseInt(rc[1]);
		
		int[][] sheet=new int[r+1][c+1];
		
		for(i=0;i<r;i++){
			String[] num=br.readLine().split(" ");
			for(j=0;j<c;j++){
				sheet[i][j]=Integer.parseInt(num[j]);
				sheet[i][c]+=sheet[i][j];
				sheet[r][j]+=sheet[i][j];
			}
			sheet[r][c]+=sheet[i][c];
		}
		for(i=0;i<=r;i++){
			for(j=0;j<=c;j++){
				System.out.print(sheet[i][j]);
				if(j==c){
					System.out.println();
				}
				else{
					System.out.print(" ");
				}
			}
		}
	}
}