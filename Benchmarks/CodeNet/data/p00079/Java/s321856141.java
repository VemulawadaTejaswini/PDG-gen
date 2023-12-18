import java.util.Scanner;


public class Main {

	Scanner sc;
	
	double solve(double[][] point,int n){
		double[][] v=new double[n-1][2];
		for(int i=0;i<n-1;++i){
			for(int j=0;j<2;++j){
				v[i][j]=point[i+1][j]-point[0][j];
			}
		}
		double s=0;
		for(int i=0;i<n-2;++i){
			s+=Math.abs((v[i][0]*v[i+1][1]-v[i][1]*v[i+1][0]))/2;
		}
		return s;
	}
	
	double nd(){
		return sc.nextDouble();
	}
	
	void io(){
		double[][] point=new double[20][2];
		int n;
		sc=new Scanner(System.in).useDelimiter("\\s*,\\s*|\r\n|\n");
		for(n=0;n<20&&sc.hasNext();++n){
			for(int i=0;i<2;++i){
				point[n][i]=nd();
			}
		}
		System.out.println(solve(point,n));
	}
	
	public static void main(String[] args) {
		new Main().io();
	}
}