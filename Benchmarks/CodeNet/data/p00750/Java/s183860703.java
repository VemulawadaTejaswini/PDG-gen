import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        while(true) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int s = sc.nextInt();
            int g = sc.nextInt();
            if (n == 0) {
                break;
            }
            ArrayList<Edge>[] edge = new ArrayList[n];
            for(int i=0;i<n;i++) {
                edge[i] = new ArrayList<Edge>();
            }
            for(int i=0;i<a;i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                MutableString c = new MutableString(sc.next());
                edge[x].add(new Edge(y,c));
            }
            MutableString[] cost = new MutableString[n];
            cost[g] = new MutableString("",250);

            MutableString buf = new MutableString(250);
            for(int k=0;k<6*n+5;k++) {
                for(int i=0;i<n;i++) {
                    for(Edge e:edge[i]) {
                    	if (cost[e.to] == null) {
                    		continue;
                    	}
                    	buf.set(e.cost).concat(cost[e.to]);
                    	if (cost[i] == null) {
                    		cost[i] = new MutableString(250).set(buf);
                    	}else{
                    		cost[i].set(cost[i].compareTo(buf) < 0 ? cost[i] : buf);
                    	}
                    }
                }
            }
            if (cost[s] == null || cost[s].length() >= 6 * n) {
                System.out.println("NO");
            }else{
                System.out.println(cost[s]);
            }
            System.gc();
        }
    }

    static class Edge {
        int to;
        MutableString cost;
        public Edge(int to,MutableString cost) {
            this.to = to;
            this.cost = cost;
        }
    }
}
class MutableString implements Comparable<MutableString>{
	char[] s;
	public MutableString(String s) {
		this(s,s.length()+1);
	}
	public MutableString(String s,int bufferSize) {
		this.s = new char[bufferSize];
		for(int i=0;i<s.length();i++) {
			this.s[i] = s.charAt(i);
		}
	}
	public MutableString(int bufferSize) {
		this.s = new char[bufferSize];
	}
	public MutableString set(MutableString t) {
		int p = 0;
		for(int i=0;i<t.s.length;i++) {
			if ((s[i] = t.s[i]) == 0) {
				break;
			}
			p++;
		}
		s[p] = 0;
		return this;
	}
	public MutableString concat(MutableString t) {
		int p = 0;
		while(s[p] != 0) p++;
		int q = 0;
		while(p < s.length && q < t.s.length && t.s[q] != 0) {
			s[p] = t.s[q];
			p++;
			q++;
		}
		if (p < s.length) {
			s[p] = 0;
		}
		return this;
	}

	public int compareTo(MutableString o) {
		int i = 0;
		while(true) {
			if (s[i] == 0 && o.s[i] == 0) {
				return 0;
			}
			if (s[i] == 0) {
				return -1;
			}
			if (o.s[i] == 0) {
				return 1;
			}
			if (s[i] < o.s[i]) {
				return -1;
			}
			if (s[i] > o.s[i]) {
				return 1;
			}
			i++;
		}
	}

	public int length() {
		for(int i=0;i<s.length;i++) {
			if (s[i] == 0) {
				return i;
			}
		}
		return s.length;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while(s[i] != 0) {
			sb.append(s[i]);
			i++;
		}
		return sb.toString();
	}

}