import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int r,c;
		Scanner scan = new Scanner(System.in);
		r=scan.nextInt();
		c=scan.nextInt();
		int[][] array=new int[r+1][c+1];
		for(int i=0;i<(r+1);i++)
			for(int j=0;j<(c+1);j++)
				array[i][j]=0;
		
		for(int i=0;i<r;i++){
			int temp=0;
			for(int j=0;j<c;j++){
				array[i][j]=scan.nextInt();
				temp+=array[i][j];
			}
			array[i][c]=temp;
		}
		for(int i=0;i<(c+1);i++){
			int temp=0;
			for(int j=0;j<r;j++){
				temp+=array[j][i];
			}
			array[r][i]=temp;
		}
		for(int i=0;i<(r+1);i++){
			for(int j=0;j<c;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println(array[i][c]);
		}
	}
}
