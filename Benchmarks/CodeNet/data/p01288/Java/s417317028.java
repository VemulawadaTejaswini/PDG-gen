import java.util.*;

public class Main {
	
	class Heap{
		Heap left, right;
		int value;
		
		Heap(int v){
			value = v;
			left = right = null;
		}
		
		int top(){
			return value;
		}
		
		Heap push(int v){
			return meld(new Heap(v), this);
		}
		
		Heap pop(){
			return meld(left, right);
		}
	}
	
	Heap meld(Heap a, Heap b){
		if(a == null){
			return b;
		}
		if(b == null){
			return a;
		}
		if(a.value < b.value){
			Heap t = a; a = b; b = t;
		}
		a.right = meld(a.right, b);
		Heap t = a.left; a.left = a.right; a.right = t;
		
		return a;
	}
	
	class Vert extends ArrayList<Integer>{
		int markedTime;
		int parent;
		int degree;
		Heap hp;
		ArrayList<Integer> askedTime;
	}
	
	/*
	Heap rec(Vert vs[], int vid){
		Vert v = vs[vid];
		Heap h = null;
		for(Integer t : v.askedTime){
			h = meld(h, new Heap(t));
		}
		for(Integer u : v){
			h = meld(h, rec(vs, u));
		}
		
		for(;h!=null && h.top() > v.markedTime ;h = h.pop()){
			ans += vid;
		}
		return h;
	}
	*/
	
	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			int N = in.nextInt(), Q = in.nextInt();
			if(N == 0){
				return ;
			}
			Vert[] vs = new Vert[N + 1];
			for(int i=0; i<vs.length; i++){
				vs[i] = new Vert();
				vs[i].markedTime = Integer.MAX_VALUE;
				vs[i].askedTime = new ArrayList<Integer>();
			}
			
			for(int i=2; i<=N; i++){
				int p = in.nextInt();
				vs[p].degree++;
				vs[i].parent = p;
				vs[p].add(i);
			}
			
			vs[1].markedTime = 0;
			for(int t=1; t<=Q; t++){
				String cmd = in.next();
				int v = in.nextInt();
				if(cmd.equals("M")){
					if(vs[v].markedTime == Integer.MAX_VALUE){
						vs[v].markedTime = t;
					}
				}
				else{
					vs[v].askedTime.add(t);
				}
			}
			
			long ans = 0;
			ArrayList<Integer> stack = new ArrayList<Integer>();
			for(int i=1; i<=N; i++){
				if(vs[i].degree == 0){
					stack.add(i);
				}
			}
			
			for(;!stack.isEmpty();){
				int vid = stack.get(stack.size()-1);
				stack.remove(stack.size()-1);
				Vert v = vs[vid];
				Heap h = null;
				for(Integer t : v.askedTime){
					h = meld(h, new Heap(t));
				}
				for(Integer u : v){
					h = meld(h, vs[u].hp);
				}
				
				for(;h!=null && h.top() > v.markedTime ;h = h.pop()){
					ans += vid;
				}
				v.hp = h;
				if(--vs[v.parent].degree == 0){
					stack.add(v.parent);
				}
			}
			
			System.out.println(ans);
		}
	}
	
	public static void main(String args[]){
		new Main().run();
	}
}