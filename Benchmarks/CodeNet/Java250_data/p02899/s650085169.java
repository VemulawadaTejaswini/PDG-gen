import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		for (int i = 0; i < N; i++)
			A.add(sc.nextInt());
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < N; i++)
			output.add(0);

		
		for (int i = 0; i < N; i++) {
			int AIndex = A.get(i) - 1;
			output.set(AIndex, i+1);
		}
		for(int i = 0;i<N;i++) {
			System.out.print(output.get(i)+" ");
		}
		
	}

}
