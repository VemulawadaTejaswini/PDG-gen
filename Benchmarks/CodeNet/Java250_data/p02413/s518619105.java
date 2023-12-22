import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int[][] c= new int[a][b];
		int[] asum = new int[b];
		int[] bsum = new int[a];
		int sumall = 0;
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				c[i][j]=Integer.parseInt(scan.next());
				asum[j]+=c[i][j];
				bsum[i]+=c[i][j];
				sumall+=c[i][j];
			}
		}
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println(bsum[i]);
		}
		for(int i=0;i<b;i++) 
			System.out.print(asum[i]+" ");
		System.out.print(sumall+"\r\n");
	}	
}