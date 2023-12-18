import java.awt.geom.Point2D;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ().doIt();
	}
	class AOJ{
		void doIt(){
			int DP[][] = new int[4][4001];
			for(int i = 0;i < 1001;i++)DP[0][i] = 1;
			for(int i = 1;i < 4;i++){
				for(int j = 0;j <= 3000;j++){
					for(int k = 0;k < 1001;k++){
						DP[i][j+k] = DP[i][j+k] + DP[i-1][j];
					}
				}
			}
			while(sc.hasNext()){
				int n = sc.nextInt();
				System.out.println(DP[3][n]);
			}
		}
	}
}