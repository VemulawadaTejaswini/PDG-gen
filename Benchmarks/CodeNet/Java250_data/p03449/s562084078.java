import java.util.Scanner;


class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] A = new int [3][N+1];
		int count  =0 ;
		int ans = 0;

		for(int i = 1;i < 3;i++){
			for(int j = 1;j < N+1;j++){
				A[i][j] = scan.nextInt();
			}
		}
		

		for(int i= 1;i < N+1;i++){

			int x = 1;
			count=0;
			while(x <= i){
				count += A[1][x];
				x++;
			}
			x--;
			while(x <= N ){
				count += A[2][x];
				x++;
			}
			ans = Math.max(ans, count);
		}

		System.out.println(ans);

	}

	static int count(int a,int b,int c,int X){
		if(X == a*500+b*100+c*50){
			return 1;
		}else{
			return 0;
		}
	}


}
class Pair implements Comparable{
	int from;
	int end;

	public Pair(int a,int b) {
		this.from = a;
		this.end = b;

	}
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

