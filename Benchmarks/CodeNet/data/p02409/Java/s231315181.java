import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int[][][] count = new int[4][3][10];
			int n = scan.nextInt();
			for(int i = 0 ; i< n;i++){
				int b = scan.nextInt();
				int f = scan.nextInt();
				int r = scan.nextInt();
				int v = scan.nextInt();
				count[b-1][f-1][r-1] = v;
			}
			for(int i = 0; i < count.length;i++){
				for(int j = 0 ; j < count[i].length;j++){
					System.out.print(count[i][j][0]);
					for(int k = 1; k < count[i][j].length;k++){
						System.out.print(" " + count[i][j][k]);
					}
					System.out.println();
				}
				if( i != count.length -1){
				for(int j = 0; j < 20;j++){
					System.out.print("#");
				}
				}
				System.out.println();
			}
		}finally{
			if(scan != null)scan.close();
		}
	}
}