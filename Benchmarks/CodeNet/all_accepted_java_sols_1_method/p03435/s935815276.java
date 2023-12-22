import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[][] a=new int[3][3];
		int[] x=new int[3];
		int[] y=new int[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
			
		}
		boolean flag=true;
		
			x[0]=0;
			for(int i=0;i<3;i++) {
				y[i]=a[0][i]-x[0];
			}
			for(int i=0;i<3;i++) {
				x[i]=a[i][0]-y[0];
			}
			flag=true;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(x[i]+y[j]!=a[i][j]) {
						flag=false;
						break;
					}
				}
				
			}
			
			
		
		
		if(flag) {
			System.out.println("Yes");
		}
		else{
				System.out.println("No");
			}
		
	}

}
