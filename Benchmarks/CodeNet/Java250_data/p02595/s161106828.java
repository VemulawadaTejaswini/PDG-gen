import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int count = 0;
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int D = scan.nextInt();
		int[][] point = new int[N][2];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<2;j++) {
				point[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0;i<N;i++) {
			double a = Math.sqrt(Math.pow(point[i][0],2)+Math.pow(point[i][1],2));
			if(a<=D) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}