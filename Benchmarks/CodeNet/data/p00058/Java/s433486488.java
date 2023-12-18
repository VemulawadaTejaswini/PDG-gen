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
			double tmp = p[1][0]-p[0][0];
			double m1 = 0;
			int flag = 0;
			if(tmp!=0){
				m1 = (p[1][1]-p[0][1])/(p[1][0]-p[0][0]);
			}
			else{
				flag=1;
			}
			double m2 = (p[3][1]-p[2][1])/(p[3][0]-p[2][0]);
			int res = (int) (m1*m2);
			if(res==-1||flag!=1){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}