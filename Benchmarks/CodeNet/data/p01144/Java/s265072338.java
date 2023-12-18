import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Solve{
	final Scanner in = new Scanner(System.in);
	boolean solve(){
		int n = in.nextInt();
		int m = in.nextInt();
		if(n == 0) return false;
		Pos[] pos = new Pos[n];
		for(int i=0; i<n; i++){
			pos[i] = new Pos(in.nextInt(), in.nextDouble());
		}
		Arrays.sort(pos);
		int res = 0;
		for(int i=0; i<n; i++){
			if(m>0){
				m -= pos[i].dist;
				pos[i].dist = 0;
				if(m < 0) pos[i].dist += -m;
			}
			res += pos[i].dist*pos[i].p;
		}
		System.out.println(res);
		return true;
	}
}

class Pos implements Comparable<Pos>{
	int dist;
	double p;
	Pos(int d, double p){
		dist = d;
		this.p = p;
	}
	
	@Override
	public int compareTo(Pos o) {
		return Double.compare(o.p, p);
	}
}

public class Main{
	public static void main(String[] args) throws IOException{
		Solve solve = new Solve();
		while(solve.solve());
	}
}