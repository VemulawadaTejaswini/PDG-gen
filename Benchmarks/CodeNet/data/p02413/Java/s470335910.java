import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] sheet = new int[r+1][c+1];
	//in	
		for(int i=0;i<r;i++){
			String[] line = sc.nextLine().spilt(" ");
			int sum=0;
			for(int j=0;j<c;j++){
				sheet[i][j]=Integer.parseInt(line[j]);
				sum = sum+sheet[i][j]
			}
			sheet[i][c]=sum;
		}	
		for(int i=0;i<c+1;i++){
			int sum=0;
			for(int j=0;j<r;j++){
				sum+=sheet[j][i];
			}
			sheet[r][i]=sum;
		}
	//out
		for(int i=0;i<r+1;i++){
			for(int j=0;j<c+1;j++){
				System.out.print(sheet[i][j]+" ");
			}
			System.out.println();
		}
	}
}