
import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(s.hasNextDouble()){
			double[][] p = new double[4][2];
			for(int i=0;i<4;i++)for(int j=0;j<2;j++)p[i][j]=s.nextDouble();
			for(int i=0;i<3;i++){
				int a=i;int b=(i+1)%3;int c=(i+2)%3;
				if(((p[b][0]-p[a][0])*(p[c][1]-p[a][1])-(p[c][0]-p[a][0])*(p[b][1]-p[a][1]))*((p[b][0]-p[a][0])*(p[3][1]-p[a][1])-(p[3][0]-p[a][0])*(p[b][1]-p[a][1]))<0.0){
					System.out.println("NO");
					break;
				}
				if(i==2)System.out.println("YES");
			}
		}
	}
}