import java.util.Scanner;

public class Main {

	static int a,b;
	static int[][] field;

	public static void main(String args[]){

		Scanner s=new Scanner(System.in);
		while(true){

			a=s.nextInt();
			if(a==0)System.exit(0);
			int minN=0,maxN=0;
			int[][] map = new int[10][10];
			for(int i=0; i<10; i++) {
				for(int j=0; j<10; j++) {
					map[i][j] = 1<<25;
					if(i==j)map[i][j]=0;
				}
			}

			for(int i=0; i<a; i++) {
				int p = s.nextInt();
				int q = s.nextInt();
				int w = s.nextInt();
				maxN = Math.max(maxN,Math.max(p, q));
				map[p][q] = Math.min(map[p][q], w);
				map[q][p] = map[p][q];
			}

			for(int k=0; k<10; k++) {
				for(int i=0; i<10; i++) {
					for(int j=0; j<10; j++) {
						if(map[i][j]>map[i][k]+map[k][j]) {
							map[i][j]=map[i][k]+map[k][j];
						}
					}
				}
			}

			int minSum= 1<<25;
			for(int i=0; i<=maxN; i++) {
				int sum=0;
				for(int j=0; j<=maxN; j++) {
					sum+=map[i][j];
				}
				if(sum<minSum) {
					minN=i;
					minSum=sum;
				}
			}
			System.out.println(minN+" "+minSum);
		}
	}

}

