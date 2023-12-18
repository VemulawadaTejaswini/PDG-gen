import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IN:while(true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m == 0 && n == 0) break;
			int d = sc.nextInt();
			int ns = sc.nextInt();
			HashMap<String,Integer> SMap = new HashMap<String,Integer>();
			for(int i = 0; i < ns; i++) {
				SMap.put(sc.next(), sc.nextInt());
			}
			HashMap<String,Boolean> CMap = new HashMap<String,Boolean>();
			int nc = sc.nextInt();
			for(int i = 0; i < nc; i++) {
				String a = sc.next();
				String b = sc.next();
				CMap.put(a+b, true);
				CMap.put(b+a, true);
			}
			HashMap<String,Integer> JMap = new HashMap<String,Integer>();
			int nj = sc.nextInt();
			for(int i = 0; i < nj; i++) {
				String a = sc.next();
				String b = sc.next();
				int t = sc.nextInt();
				JMap.put(a+b, t);
				JMap.put(b+a, t);
			}
			String start = sc.next();
			String goal  = sc.next();
			PriorityQueue<Node> queue = new PriorityQueue<Node>();
			HashMap<String,Boolean> al = new HashMap<String,Boolean>();

			
			queue.add(new Node(0,start,1));
			
			//0 N 1 W 2 S 3 E
			
			while(!queue.isEmpty()) {
				Node tmp = queue.poll();
				if(al.containsKey(tmp.name + tmp.time + tmp.x)) continue;
				al.put(tmp.name + tmp.time + tmp.x, true);
				if(tmp.time > 100) continue;
				if(tmp.name.equals(goal)) {
					System.out.println(tmp.time);
					continue IN;
				}
				//System.out.println(tmp.name + " " + tmp.time + " " + tmp.x );
				for(int i = 0; i < 4; i++) {
					String to = "";
					if(i == 0) {
						if(tmp.x == 2) continue;
						to += String.valueOf((char)(tmp.name.charAt(0) - 1));
						to += "-" + tmp.name.substring(2);
						if(to.charAt(0) < 'a') continue;
					}
					else if(i == 1) {
						if(tmp.x == 3) continue;
						to += String.valueOf(tmp.name.charAt(0)) + "-";
						to += String.valueOf(Integer.parseInt(tmp.name.substring(2))+1);
						if(Integer.parseInt(to.substring(2)) > n) continue;
					}
					else if(i == 2) {
						if(tmp.x == 0) continue;
						to += String.valueOf((char)(tmp.name.charAt(0) + 1));
						to += "-" + String.valueOf(tmp.name.substring(2));
						if(to.charAt(0) - 'a' >= m) continue;
					}
					else if(i == 3) {
						if(tmp.x == 1) continue;
						to += String.valueOf(tmp.name.charAt(0)) + "-";
						to += String.valueOf(Integer.parseInt(tmp.name.substring(2))-1);
						if(Integer.parseInt(to.substring(2)) <= 0) continue;
					}
					
					
					String ckx = tmp.name + to;
					if(CMap.containsKey(ckx)) {
						continue;
					}
					
					int time = tmp.time + d;
					
					if(JMap.containsKey(ckx)) {
						time += JMap.get(ckx);				
					}
					
					if(SMap.containsKey(to)) {
						int ck = (time / SMap.get(to)) % 2;
						if(i == 0 && ck == 1) continue;
						if(i == 1 && ck == 0) continue;
						if(i == 2 && ck == 1) continue;
						if(i == 3 && ck == 0) continue;
					}
					
					queue.add(new Node(time,to,i));

					
				}
			}
		}
	}
	
	static class Node implements Comparable<Node> {
		int time;
		String name;
		int x;
		Node(int a, String b,int c) {
			time = a;
			name = b;
			x = c;
		}
		@Override
		public int compareTo(Node o) {
			return this.time - o.time;
		}
		
	}
}