import java.util.Scanner;
public class Main {
	static int[] parent;
	static int[] weights;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int users = input.nextInt();
		int connections = input.nextInt();
		parent = new int[users];
		weights = new int[users];
		for(int i = 0; i < users; i++) {
			parent[i] = i;
			weights[i] = 1;
		}
		for(int i = 0; i < connections; i++) {
			int x = input.nextInt();
			int y = input.nextInt();
			union(x, y);
		}
		
		int tries = input.nextInt();
		for(int i = 0; i < tries; i++) {
			int num = input.nextInt();
			int num1 = input.nextInt();
			check(num, num1);
		}
		input.close();

	}
	public static void union(int x, int y) {
		int r1 = find(x);
		int r2 = find(y);
		if(r1 != r2) {
			if(weights[r2] > weights[r1]) {
				parent[r1] = r2;
				weights[r2] += weights[r1];
			}else {
				parent[r2] = r1;
				weights[r1] += weights[r2];
			}
		}
	}
	public static int find(int x) {
		int curr = x;
		while(parent[curr] != curr)
			curr = parent[curr];
		return curr;
	}
	public static void check(int x, int y) {
		int num = find(x);
		int num1 = find(y);
		if(num == num1) 
			System.out.println("yes");
		else
			System.out.println("no");
	}
}

