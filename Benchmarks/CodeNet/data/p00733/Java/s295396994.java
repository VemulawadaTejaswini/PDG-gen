import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Dr. Podboq or: How We Became Asymmetric
public class Main{

	class R{
		String rep;
		Set<String> sub;
		int id, left, right;
		double rate;
		public R(int id) {
			this.id = id;
			left = right = -1;
			rep = "";
			rate = 0;
			sub = new HashSet<String>();
		}
		void f(boolean isLeft){
//			System.out.println("ID:"+id);
			if(left==-1)return;
			double rx = rs[left].rate, ry = rs[right].rate;
//			System.out.println(rep);
//			System.out.println(rx+" "+ry);
			if(Math.abs(rx-ry)>1e-9){
				int lid = left, rid = right;
				if(rx<ry&&!isLeft){
					lid = right; rid = left;
				}
				else if(ry<rx&&isLeft){
					lid = right; rid = left;
				}
				left = lid; right = rid;
				rs[left].f(true); rs[right].f(false);
				return;
			}
			if(rx==0)return;
			rx = Math.min(rs[rs[left].left].rate, rs[rs[left].right].rate);
			ry = Math.min(rs[rs[right].left].rate, rs[rs[right].right].rate);
			if(Math.abs(rx-ry)>1e-9){
				int lid = left, rid = right;
				if(rx<ry&&!isLeft){
					lid = right; rid = left;
				}
				else if(ry<rx&&isLeft){
					lid = right; rid = left;
				}
				left = lid; right = rid;
				rs[left].f(true); rs[right].f(false);
				return;
			}
			rx = Math.max(rs[rs[left].left].rate, rs[rs[left].right].rate);
			ry = Math.max(rs[rs[right].left].rate, rs[rs[right].right].rate);
			if(Math.abs(rx-ry)>1e-9){
				int lid = left, rid = right;
				if(rx<ry&&!isLeft){
					lid = right; rid = left;
				}
				else if(ry<rx&&isLeft){
					lid = right; rid = left;
				}
				left = lid; right = rid;
			}
			rs[left].f(true); rs[right].f(false);
		}
		void calc(){
			if(left==-1)return;
			Set<String> set = new HashSet<String>();
			set.addAll(rs[left].sub); set.addAll(rs[right].sub);
			int c = 0;
			for(String r:rs[left].sub)if(rs[right].sub.contains(r))c++;
			rate = c*1.0/set.size();
		}
		public String toString(){
			if(left==-1)return "x";
			return "("+rs[left]+" "+rs[right]+")";
		}
	}

	R[] rs;
	
	int idx, ID;
	char[] s;
	char get(){
		return s[idx++];
	}
	
	int tree(){
		int res = ID++;
		rs[res] = new R(res);
		char ch = get();
		if(ch=='x'){
			rs[res].rep = "x";
			rs[res].sub.add("x");
			return res;
		}
		int left = tree();
		get();
		int right = tree();
		get();
		int lid = left, rid = right;
		if(rs[left].rep.compareTo(rs[right].rep)<=0){
			lid = left;
			rid = right;
		}
		else{
			lid = right;
			rid = left;
		}
		rs[res].left = lid; rs[res].right = rid;
		rs[res].rep = "("+rs[lid].rep+" "+rs[rid].rep+")";
		rs[res].sub.addAll(rs[lid].sub); rs[res].sub.addAll(rs[rid].sub);
		rs[res].sub.add(rs[res].rep);
		rs[res].calc();
		return res;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			s = sc.nextLine().toCharArray();
			if(s[0]=='0')break;
			idx = ID = 0;
			rs = new R[128];
			tree();
//			System.out.println(rs[0].rate);
//			for(String r:rs[0].sub)System.out.println(r);
			rs[0].f(true);
			System.out.println(rs[0]);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}