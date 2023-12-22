import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n,m,l;
		long cal;
		int i,j,k;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		l=scan.nextInt();
		long[][] yousoA =new long[n][m];
		long[][] yousoB =new long[m][l];
		long[][] yousoC =new long[n][l];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++) {
			cal=scan.nextInt();
			yousoA[i][j]=cal;
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<l;j++) {
				cal=scan.nextInt();
				yousoB[i][j]=cal;
				}
		}
		for(i=0;i<n;i++)
		{
			cal=0;
			for(j=0;j<l;j++) {
				for(k=0;k<m;k++) {
				cal=cal+yousoA[i][k]*yousoB[k][j];
				}
				yousoC[i][j]=cal;
				cal=0;
				if(j==l-1)
					break;
				System.out.print(yousoC[i][j]+" ");
			}
			System.out.println(yousoC[i][j]);
			
		}
		
	}
}