import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		double[][] p = new double[4][2];
		while(stdIn.hasNext()){
			for(int i=0;i<4;i++){
				for(int j=0;j<2;j++){
					p[i][j]=stdIn.nextDouble();
				}
			}
			double AB_x = p[1][0]-p[0][0];
			double AB_y = p[1][1]-p[0][1];
			double CD_x = p[3][0]-p[2][0];
			double CD_y = p[3][1]-p[2][1];
			if(AB_x*CD_x+AB_y*CD_y==0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}