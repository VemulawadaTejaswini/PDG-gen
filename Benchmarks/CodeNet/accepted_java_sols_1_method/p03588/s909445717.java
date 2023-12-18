import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] input = new int[2];
		for(int i = 0;  i < N; i++){
			int A = stdIn.nextInt();
			int B = stdIn.nextInt();
			if(input[0] < A){
				input[0] = A;
				input[1] = B;
			}
		}
		System.out.println(input[0]+input[1]);
	}
}