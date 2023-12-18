import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] _in = reader.readLine().split(" ");
		int v = Integer.parseInt(_in[0]);
		int e = Integer.parseInt(_in[1]);
		Group[] groups = new Group[v];
		for(int i = 0; i < v; i++) groups[i] = new Group();
		List<Branch> branches = new ArrayList<>(e);
		for(int i = 0; i < e; i++) {
			_in = reader.readLine().split(" ");
			branches.add(new Branch(
				Integer.parseInt(_in[0]),
				Integer.parseInt(_in[1]),
				Integer.parseInt(_in[2])
			));
		}
		Collections.sort(branches);
		int result = 0;
		for(Branch _b : branches) {
			Group g1 = groups[_b.s].getGroup();
			Group g2 = groups[_b.t].getGroup();
			if(g1==g2) continue;
			Group newg = new Group();
			g1.parent = newg;
			g2.parent = newg;
			result += _b.v;
		}
		System.out.println(result);
	}
}

class Group{
	Group parent;
	Group(){
	}
	Group getGroup() {
		return (parent==null)?this:parent.getGroup();
	}
}

class Branch implements Comparable<Branch>{
	int s,t;
	int v;
	Branch(int _s, int _t, int _v) {
		s = _s;
		t = _t;
		v = _v;
	}
	@Override
	public int compareTo(Branch _b) {
		return this.v - _b.v;
	}
}