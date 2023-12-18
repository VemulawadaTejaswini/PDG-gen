import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int l = sc.nextInt();
		RMQ<Team> rmq = new RMQ<Team>(n);
		int[] time = new int[n];
		int[] d = new int[r+2];
		int[] t = new int[r+2];
		int[] x = new int[r+2];
		for(int i=1;i<=r;i++) {
			d[i] = sc.nextInt()-1;
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
		}
		d[0] = 0;
		t[0] = 0;
		x[0] = 0;
		d[r+1] = 0;
		t[r+1] = l;
		x[r+1] = 0;
		for(int i=0;i<n;i++) {
			rmq.update(i, new Team(i,0));
		}
		for(int i=0;i<=r;i++) {
			Team tmp = rmq.get(d[i]);
			rmq.update(d[i], new Team(tmp.id,tmp.score + x[i]));
			Team winner = rmq.query(0, n);
			time[winner.id] += t[i+1] - t[i];
			//System.out.println(rmq.toString());
		}
		//System.out.println(Arrays.toString(time));
		int ans = 0;
		int max = 0;
		for(int i=0;i<n;i++) {
			if (time[i] > max) {
				max = time[i];
				ans = i;
			}
		}
		System.out.println(ans+1);
	}

	static class Team implements Comparable<Team>{
		int id, score;
		public Team(int id,int score) {
			this.id = id;
			this.score = score;
		}
		public int compareTo(Team o) {
			if (this.score != o.score) {
				return o.score-this.score;
			}
			return this.id-o.id;
		}
		public String toString() {
			return "[id:" + this.id + " ,score:" + this.score + "]";
		}
	}

}
class RMQ<E extends Comparable<E>> {
	private int size;
	private int size_ = 1;
	private ArrayList<E> data;

	public RMQ(int size) {
		this.size = size;
		while(this.size_<this.size) {
			this.size_*=2;
		}
		data = new ArrayList<E>(Collections.nCopies(size_*2-1, (E) null));//[size_*2-1];
	}

	public E get(int k) {
		return data.get(k+size_-1);
	}

	public void update(int k,E a) {
		k+=size_-1;
		data.set(k, a);
		while(k>0) {
			k=(k-1)/2;
			data.set(k, min(data.get(k*2+1),data.get(k*2+2)));
		}
	}

	public E query(int a,int b) {
		return query(a,b,0,0,size_);
	}

	//[a,b)の区間について処理
	//kは接点の番号,[l,r)がkに対応する節点
	private E query(int a,int b,int k,int l,int r) {
		if (r<=a || b<=l) {
			return null;
		}
		if (a<=l && r<=b) {
			return data.get(k);
		}else{
			return min(query(a,b,k*2+1,l,(l+r)/2), query(a,b,k*2+2,(l+r)/2,r));
		}
	}

	//nullはINFとして扱う
	private E min(E a,E b) {
		if (a!=null && b!=null) {
			return a.compareTo(b)<0 ? a : b;
		}else if (a!=null) {
			return a;
		}else{
			return b;
		}
	}

	public String toString() {
		return data.subList(size_-1, size+size_).toString();
	}
}