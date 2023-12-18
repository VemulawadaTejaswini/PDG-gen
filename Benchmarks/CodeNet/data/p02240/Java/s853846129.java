import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
public class Main {
    public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] input = br.readLine().split(" ");
	int n = Integer.parseInt(input[0]);
	int m = Integer.parseInt(input[1]);
	int [][] relationship = new int[n][n];
	int s, t;
	for (int i = 0; i < m; i++) {
	    input = br.readLine().split(" ");
	    s = Integer.parseInt(input[0]);
	    t = Integer.parseInt(input[1]);
	    relationship[s][t] = 1;
	}
	Connection con = new Connection(n, relationship);
	int q = Integer.parseInt(br.readLine());
	//con.makeFollowable();
	for (int i = 0; i < q; i++) {
	    input = br.readLine().split(" ");
	    s = Integer.parseInt(input[0]);
	    t = Integer.parseInt(input[1]);
	    if (con.dfs(s, t)) {
		System.out.println("yes");
	    } else {
		System.out.println("no");
	    }
	}
    }
}

class Connection {
    int n;
    int[][] relationship;
    boolean[][] followable;
    Connection (int n, int[][] relationship) {
	this.n = n;
	this.relationship = relationship;
	followable = new boolean[n][n];
    }

    /*
    public void makeFollowable () {
	for (int i = 0; i < n; i++) {
	    for (int id = 1; id < n; id++) {
		dfs(i, id++);
	    }
	}
    }
    */

    public boolean isOK(int s, int t) {
	return followable[s][t];
    }
    
    public boolean dfs (int s, int t) {
	boolean[] done = new boolean[n];
	done[s] = true;
	ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
	stack.push(s);
	while (stack.size() != 0) {
	    int u = stack.pop();
	    for (int i = 0; i < n; i++) {
		if (relationship[u][i] != 1 || u == i) {
		    continue;
		}
		if (i == t) {
		    return true;
		}
		if (done[i] == false) {
		    done[i] = true;
		    stack.push(i);
		}
	    }
	}
	return false;
    }
}