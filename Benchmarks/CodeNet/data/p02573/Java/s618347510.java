import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	private static ArrayList<Integer> UnionFind = new ArrayList<Integer>();
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		for(int i = 0; i < N; i ++) {
			UnionFind.add(-1);
		}
		for(int i = 0; i < M; i ++) {
			unit(stdIn.nextInt() - 1, stdIn.nextInt() - 1);
		}
		Collections.sort(UnionFind);
		System.out.println(UnionFind.get(0) * -1);
	}
	
	private static int getRoot(int x) {
		int root = -1;
		if(0 <= UnionFind.get(x)) {
			root = getRoot(UnionFind.get(x));
		}else {
			return x;
		}
		return root;
	}
	
	private static void unit(int A, int B) {
		int rootA = getRoot(A);
		int rootB = getRoot(B);
		if(rootA != rootB) {
			UnionFind.set(rootA, UnionFind.get(rootA) + UnionFind.get(rootB));
			UnionFind.set(rootB, rootA);
		}
	}
}