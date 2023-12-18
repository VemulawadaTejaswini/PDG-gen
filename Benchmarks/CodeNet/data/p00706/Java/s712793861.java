import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n =sc.nextInt();
				if(n==0) break;
				int w=sc.nextInt();
				int h=sc.nextInt();
				int[][] tree=new int[w+1][h+1];
				for(int i=0; i<n; i++) {
					int x=sc.nextInt();
					int y=sc.nextInt();
					tree[x][y]=1;
				}
				int s=sc.nextInt();
				int t=sc.nextInt();
				int max=0, sum=0;
				for(int i=1; i+s-1<=w; i++) {
					for(int j=1; j+t-1<=h; j++) {
						sum=0;
						for(int ii=i; ii<=i+s-1; ii++) {
							for(int jj=j; jj<=j+t-1; jj++) {
								sum+=tree[ii][jj];
							}
						}
						max=Math.max(sum, max);
					}
				}
				System.out.println(max);
				
			}

		}
	}
}
