import java.util.Arrays;
import java.util.Scanner;


public class Main{
	Scanner sc;
	double[][] A;
	double[][] B;
	
	/* Game
	 * すべての接触パターンについて、共通の部分を抜き出す。共通なのでAND
	 */
	boolean solve(double[][] a, double[][] b){
		return a[0][0]<b[1][0] && b[0][1]<a[1][1] && b[0][0]<a[1][0] && a[0][1]<b[1][1];
	}
	
	void io(){
		sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			A = new double[2][];
			B = new double[2][];
			for(int i=0; i<2; ++i){
				A[i] = new double[]{nd(), nd()};
			}
			for(int i=0; i<2; ++i){
				B[i] = new double[]{nd(), nd()};
			}
			
			System.out.println((solve(A, B)) ? "YES" : "NO");
		}
		
		sc.close();
	}
	
	double nd(){
		return sc.nextDouble();
	}
	
	public static void main(String[] args){
		new Main().io();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}