import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r,c;
		r=scan.nextInt();
		c=scan.nextInt();
		int sheet[][]=new int[r+1][c+1];
		for(int i=0;i<r+1;i++) {
			for(int j=0;j<c;j++) {
					if(j==0)sheet[i][c]=0;
					if(i<r)sheet[i][j]=scan.nextInt();
					if(i==0)sheet[r][j]=sheet[i][j];
					else if(i<r)sheet[r][j]+=sheet[i][j];
					System.out.print(sheet[i][j]+" ");
					sheet[i][c]+=sheet[i][j];
			}
			System.out.println(sheet[i][c]);
		}
		scan.close();
	}

}
