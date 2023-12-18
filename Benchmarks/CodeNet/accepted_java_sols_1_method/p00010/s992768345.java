import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int x=s.nextInt();
		while(x-->0){
			double[][] n = new double[4][3];
			for(int i=0;i<3;i++){
				for(int j=0;j<2;j++){n[i][j]=s.nextDouble();}
				n[i][2]=-(n[i][0]*n[i][0]+n[i][1]*n[i][1]);
			}
			for(int i=0;i<2;i++)for(int j=0;j<3;j++)n[i][j]-=n[2][j];
			n[3][0]=(n[0][2]*n[1][1]-n[0][1]*n[1][2])/(((n[0][0]*n[1][1]-n[0][1]*n[1][0])==0)?(1):(n[0][0]*n[1][1]-n[0][1]*n[1][0]));
			n[3][1]=(n[0][2]*n[1][0]-n[0][0]*n[1][2])/(((n[0][1]*n[1][0]-n[0][0]*n[1][1])==0)?(1):(n[0][1]*n[1][0]-n[0][0]*n[1][1]));
			n[3][2]=n[2][2]-n[3][0]*n[2][0]-n[3][1]*n[2][1];
			n[3][0]/=(-2);n[3][1]/=(-2);
			n[3][2]=Math.sqrt(n[3][0]*n[3][0]+n[3][1]*n[3][1]-n[3][2]);
			System.out.printf("%.3f %.3f %.3f\n",n[3][0],n[3][1],n[3][2]);
		}
	}
}