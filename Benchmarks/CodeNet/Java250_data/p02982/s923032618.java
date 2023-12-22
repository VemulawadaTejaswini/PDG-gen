import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		
		int x[][] = new int[n][d];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<d;j++) {
				x[i][j]=sc.nextInt();
			}
		}
		
		int ichiji = 0;
		int count = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				ichiji = 0;
				for(int k=0;k<d;k++) {
					ichiji+=(x[i][k]-x[j][k])*(x[i][k]-x[j][k]);
				}
				if(isheiho(ichiji))
					count++;
			}
		}
		
		System.out.print(count);
		
	}
	
	public static boolean isheiho(int k) {
		int i=0;
		while(i*i<=k) {
			if(i*i==k)
				return true;
			else
				i++;
		}
		return false;
	}

}