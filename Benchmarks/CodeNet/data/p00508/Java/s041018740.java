import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		final int n=Integer.parseInt(sc.nextLine());
		int[][] p=new int[2][n];
		for(int i=0;i<n;i++){
			p[0][i]=sc.nextInt();
			p[1][i]=sc.nextInt();
		}
		
		int d=(p[0][0]-p[0][1])*(p[0][0]-p[0][1])+(p[1][0]-p[1][1])*(p[1][0]-p[1][1]);
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int d1=(p[0][i]-p[0][j])*(p[0][i]-p[0][j])+(p[1][i]-p[1][j])*(p[1][i]-p[1][j]);
				if(d>d1){
					d=d1;
				}
			}
		}
		System.out.println(d);
	}
	static int kaijo(int n){
		if(n==1){
			return n;
		}else{
			return n*kaijo(n-1);
		}
	}
}
