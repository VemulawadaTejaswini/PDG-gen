import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n;
		double[] ans = new double[4];
		for(int i=0;i<4;i++){
			ans[i]=0;
		}
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		int[][] vectors = new int[2][n];
		int[] vd = new int[n];
		for(int i=0;i<2;i++){
			for(int j=0;j<n;j++){
				vectors[i][j]=scan.nextInt();
			}
		}
		scan.close();
		
		for(int i=0;i<n;i++){
			vd[i]=Math.abs(vectors[0][i]-vectors[1][i]);
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<n;j++){
				ans[i]+=Math.pow(vd[j], (i+1));
				if(vd[j]>ans[3]){
					ans[3]=vd[j];
				}
			}
		}
		ans[1]=Math.sqrt(ans[1]);
		ans[2]=Math.cbrt(ans[2]);
		for(int i=0;i<n;i++){
			if(ans[3]<vd[i]){
				ans[3]=vd[i];
			}
		}
		for(int i=0;i<4;i++){
			System.out.println(ans[i]);
		}
	}
}

