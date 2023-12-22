import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[][]a=new int[n][3];
		
		for(int j=0;j<n;j++)
			for(int l=0;l<3;l++)
			a[j][l]=scan.nextInt();
			
		for(int i=0;i<n;i++)
			{Arrays.sort(a[i]);	
			if(a[i][0]*a[i][0]+a[i][1]*a[i][1]==a[i][2]*a[i][2])
				System.out.println("YES");
			else
				System.out.println("NO");
			}
}}