import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		sc.close();
		
		int A = X;
		int B = Y;
		int C = Z;
		
		//System.out.printf("%d %d %d\n", A, B, C);

		Pair<Integer, Integer> model1 = new Pair<Integer, Integer>(A, B);
		A = model1.second;
		B = model1.first;

		Pair<Integer, Integer> model2 = new Pair<Integer,Integer>(A, C);
		A = model2.second;
		C = model2.first;
		
		System.out.printf("%d %d %d\n", A, B, C);
	}

	static class Pair<F, S> {
		public final F first;
		public final S second;

		Pair (F first, S second) {
			this.first = first;
			this.second = second;
		}
	}
}