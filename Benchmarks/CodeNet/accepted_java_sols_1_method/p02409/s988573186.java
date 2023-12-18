import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][][] count = new int[4][3][10];
		int[] vb = new int[4];

		for(int i=0;i<n;i++){
			for(int j=0;j<4;j++)
				vb[j]=scan.nextInt();
			count[vb[0]-1][vb[1]-1][vb[2]-1]+=vb[3];
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<10;k++){
					System.out.print(" "+count[i][j][k]);
				}
				System.out.println("");
			}
			if(i!=3)
				System.out.println("####################");
		}
	}
}