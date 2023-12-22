import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int count = 0;
			int N = in.nextInt();
			int A = in.nextInt();
			int B = in.nextInt();
			int C = in.nextInt();
			int X = in.nextInt();
			if(A == 0 &&B == 0&&C == 0&&N == 0&&X == 0)break;
			int[]Y = new int [N];
			for(int i = 0;i < N;i++){
				Y[i] = in.nextInt();
			}
			for(int i = 0;i <= 10000;i++){
				if(Y[count] == X){
					count++;
				}
				if(count == N){
					System.out.println(i);
					break;
				}
				X = (A * X + B) % C;
				if(i == 10000){
					System.out.println(-1);
				}
			}
		}
	}
}