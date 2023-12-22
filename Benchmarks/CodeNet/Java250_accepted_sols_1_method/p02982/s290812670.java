import java.util.Scanner;
 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int count = 0;
		double[][] a = new double[N][D];
		for(int i=0;i<N;i++) {
			for(int j=0;j<D;j++) {
				 a[i][j]  = sc.nextInt(); 
			}
		}
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				double sum = 0;
				for(int k=0;k<D;k++) {
				sum +=  Math.pow(a[i][k]-a[j][k],2);
			}
				sum=Math.sqrt(sum);
				if(sum%1==0) {
					count++;
				}
		}
	}
		System.out.println(count);
}
}
