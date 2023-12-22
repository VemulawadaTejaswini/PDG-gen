import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[][] miti=new int[N][2];
		int[] diff=new int[N];
		int wa=0;

		for(int i=0; i<2; i++) {
			for(int j=0; j<N; j++) {
				miti[j][i]=sc.nextInt();
			}
		}
		int c_max=-114514;
		int tmp=0;
		for(int i=0; i<N; i++) {
			tmp=0;
			for(int j=0; j<N; j++) {
				if(j<=i) {
					tmp+=miti[j][0];
				}
				else {
					tmp+=miti[j][1];
				}
				if(j==i) {
					tmp+=miti[j][1];
				}
			}
			if(tmp>c_max) {
				c_max=tmp;
			}
		}
		System.out.println(c_max);
	}
}