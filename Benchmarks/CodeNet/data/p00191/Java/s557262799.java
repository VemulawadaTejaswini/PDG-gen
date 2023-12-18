import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	double DP(double gn[][],int n,int m){
		double result = 1.00;
		double gli[][] = new double [n][m];
		for(int i = 0;i < n;i++){
			gli[i][0] = 1.00;
		}
		for(int i = 1;i < m;i++){
			for(int j = 0;j < n;j++){
				for(int k = 0;k < n;k++){
					if(gli[j][i] < gli[k][i-1]*gn[k][j]){
						gli[j][i] = gli[k][i-1]*gn[k][j];
					}
				}
			}
		}
		for(int j = 0;j < n;j++){
			if(gli[j][m-1] > result)result = gli[j][m-1];
		}
		return result;
	}
	void doIt() { 
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n+m==0)break;
			double gn[][] = new double [n][n];
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					gn[i][j] = sc.nextDouble();
				}
			}
			System.out.printf("%1.2f\n",DP(gn,n,m));
		}
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}