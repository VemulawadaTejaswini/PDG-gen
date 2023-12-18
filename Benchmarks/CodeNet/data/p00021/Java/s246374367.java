import java.util.Scanner;


public class Main {
	Scanner sc;
	
	boolean solve(double p[][]){
		double vec[][]=new double[2][2];
		for(int i=0;i<2;++i){
			for(int j=0;j<2;++j){
				vec[i][j]=p[i*2+1][j]-p[i*2][j];
			}
		}
		return vec[0][0]*vec[1][1]-vec[0][1]*vec[1][0]==0;
	}
	
	double nd(){
		return sc.nextDouble();
	}
	
	void io(){
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int k=0;k<n;++k){
			double[][] point=new double[4][2];
			for(int i=0;i<4;++i){
				for(int j=0;j<2;++j){
					point[i][j]=nd();
				}
			}
			System.out.println(solve(point)?"YES":"NO");
		}
	}

	public static void main(String[] args) {
		new Main().io();
	}
}