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
		
		int[] d=new int[kaijo(n)];
		int k=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				d[k]=(p[0][i]-p[0][j])*(p[0][i]-p[0][j])+(p[1][i]-p[1][j])*(p[1][i]-p[1][j]);
				k=k+1;
			}
		}
		Arrays.sort(d);
		System.out.println(d[d.length-1]);
	}
	static int kaijo(int n){
		if(n==1){
			return n;
		}else{
			return n*kaijo(n-1);
		}
	}
}
