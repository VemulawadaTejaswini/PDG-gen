
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static final int FROM = 0;
	public static final int TO = 1;
	public static final int DIS = 2;

	public static void main(String[] args) {
		doIt();
	}

	public static void printQueue(PriorityQueue<E> pq){
		Iterator<E> it = pq.iterator();
		while(it.hasNext()){
			E t = it.next();
			System.out.println("from " + t.from + " , to " + t.to + " , distance " + t.distance);
		}
	}
	
	public static void print(int[] a){
		for(int n : a){
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<E> pq = new PriorityQueue<E>();
		while(n != 0){
			int m = sc.nextInt();
			for(int i = 0; i < m; i++){
				String s = sc.next();
				//System.out.println(s);
				String[] ss = s.split(",");
				pq.add(new E(Integer.parseInt(ss[FROM]),Integer.parseInt(ss[TO]),Integer.parseInt(ss[DIS])));
			}
			//printQueue(pq);
			//連結関係を表す。同じ数字なら連結している
			int[] con = new int[n];
			for(int i = 0; i < n; i++){
				con[i] = i;
			}

			//pqを初めから見ていき、頂点を連結させていく
			int len = pq.size();
			int ans = 0;
			int len2 = con.length;
			for(int i = 0; i < len; i++){
				E edge = pq.poll();
				//まだ連結されていなかったら
				if(con[edge.from] != con[edge.to]){
					//連結する
					//con[edge.to] = con[edge.from];
					ans += edge.distance / 100 - 1;
					if(connectAndCheck(con, len2, con[edge.to], con[edge.from])){
						break;
					}
				}
				//print(con);
			}
			System.out.println(ans);
			n = sc.nextInt();
		}
	}

	public static boolean connectAndCheck(int[] con, int len, int bef, int aft){
		boolean bRet = true;
		int e = con[0];
		for(int i = 0; i < len; i++){
			if(con[i] == bef){
				con[i] = aft;
			}
			if(e != con[i]){
				bRet = false;
			}
		}
		return bRet;
	}


}

class E implements Comparable<E>{
	public int from,to,distance;
	public E(int f, int t, int d){
		from = f;
		to = t;
		distance = d;
	}
	public int compareTo(E arg0) {
		// TODO 自動生成されたメソッド・スタブ
		return distance - arg0.distance;
	}
}