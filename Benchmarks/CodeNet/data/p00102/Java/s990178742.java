import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj0102().doIt();
	}
	class aoj0102{
		void doIt() {
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				int a[][] = new int [n+1][n+1];
				for(int i = 0;i < n;i++){
					for(int j = 0;j < n;j++){
						a[i][j] = sc.nextInt();
						a[n][j] = a[n][j] + a[i][j];
						a[i][n] = a[i][n] + a[i][j];
					}
					a[n][n] = a[n][n] + a[i][n];
				}
				for(int i = 0;i < n+1;i++){
					for(int j = 0;j < n+1;j++){
						System.out.printf("%5d",a[i][j]);
					}
					System.out.println();
				}
			}
		}
	}
}