import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int persimmon = sc.nextInt();
			if(persimmon==0) break;
			int w = sc.nextInt();
			int h = sc.nextInt();
			int[][] field = new int[h][w];

			for(int i=0; i<persimmon; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				field[y-1][x-1] = 1;
			}
			
			int s = sc.nextInt();
			int t = sc.nextInt();
			int xx = 0, yy = 0;
			int max = 0;

			while(yy+t<=h){
				xx = 0;
				while(xx+s<=w){
					int sum = 0;
					for(int i=yy; i<yy+t; i++){
						for(int j=xx; j<xx+s; j++){
							sum += field[i][j];
						}
					}
					max = Math.max(sum, max);
					xx++;
				}
				yy++;
			}

			System.out.println(max);
		}

	}
}