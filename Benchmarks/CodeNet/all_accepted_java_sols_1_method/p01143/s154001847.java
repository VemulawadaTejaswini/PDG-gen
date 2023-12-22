import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int P = in.nextInt();
		while(N != 0 || M != 0 || P != 0){
			int count = 0;
			int count2 = 0;
			for(int i = 0;i < N;i++){
				int X = in.nextInt();
				count = count + X;
				if(i + 1 == M){
					count2 = X;
				}
			}
			count = count * (100-P);
			if(count2 == 0) count = 0;
			else count = count / count2;
			System.out.println(count);
			N = in.nextInt();
			M = in.nextInt();
			P = in.nextInt();
		}
	}
}