import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n,m;
		int cal;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		int[][] yousoA =new int[n][m];
		int[] yousob =new int[m];
		int[] yousoc =new int[n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++) {
			cal=scan.nextInt();
			yousoA[i][j]=cal;
			}
		}
		for(int i=0;i<m;i++)
		{
			cal=scan.nextInt();
			yousob[i]=cal;
		}
		for(int i=0;i<n;i++)
		{
			cal=0;
			for(int j=0;j<m;j++)
				cal=cal+yousoA[i][j]*yousob[j];
			yousoc[i]=cal;
			System.out.println(yousoc[i]);
		}
		
	}
}