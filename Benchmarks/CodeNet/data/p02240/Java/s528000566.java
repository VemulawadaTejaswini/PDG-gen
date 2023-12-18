import java.util.Scanner;

// With path compression and weights

public class Main {
	static int[] parent;
	static int[] weights;
	
	static void set(int x) {
		parent[x] = x;
		weights[x] = 1;
	}
	
	static void union(int x, int y) {
	    int a = find(x);
	    int b = find(y);
	    if(a != b) {
	    	if(weights[a] > weights[b]) {
	    		parent[b] = a;
	    		weights[a] += weights[b];
	    	} else {
	    		parent[a] = b;
	    		weights[b] += weights[a];
	    	}
	    }
	    	
	}
	
	static int find(int x) {
		 int curr = x;
		 if(parent[curr] == curr) return curr;
		 parent[curr] = find(parent[curr]);
		
		 return parent[curr];
		 // path compression
	}
	
	static boolean checkConnection(int x, int y) {
		return find(x) == find(y);
	}
	
	public static void main(String[] args) {
		
		//Set up Scanner
		Scanner in = new Scanner(System.in);
		
		//set up users
		int users = in.nextInt();
		
		// set up parent and weights
		parent = new int[users];
		weights = new int[users];
		int relations = in.nextInt();
		
		// set up parent
		parent = new int[users];
		
		//fill parent with reference to itself
		for(int i = 0; i < users; i++) {
			set(i);
		}
		
		//update unions in parent
		for(int i = 0; i < relations; i++) {
			union(in.nextInt(), in.nextInt());
		}
		
		int queries = in.nextInt();
		
		for (int i = 0; i < queries; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (checkConnection(a, b)) {
				System.out.println("yes");
			} else { 
				System.out.println("no");
			}
		}

		
		//close scanner
		in.close();

	}
}

