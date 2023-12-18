import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] B = new int[N];
		for(int i = 0; i < N-1; i++) {
			B[i] = sc.nextInt();
		}
		List<Integer> A = new ArrayList<Integer>(Arrays.asList(100000));
		for(int j = 0; j < N-1; j++) {
			if(A.get(j) > B[j]) {
				A.set(j, B[j]);
			}
			A.add(j+1, B[j]);
		}
		int answer = 0;
		for(Integer k : A) {
			answer += k;
		}
		
		System.out.println(answer);
	}
}