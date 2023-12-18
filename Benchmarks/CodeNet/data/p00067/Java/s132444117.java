import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
	static int n = 12;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			char[][] m = new char[n][n];
			for(int i = 0; i < n; i++) {
				String s = sc.next();
				for(int j = 0; j < n; j++) {
					m[i][j] = s.charAt(j);
				}
			}

			DisjointSet ds = new DisjointSet(n * n);
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(i + 1 < n && m[i][j] == '1' && m[i + 1][j] == '1') {
						ds.unite(n * i + j, n * (i + 1) + j);
					}
					if(j + 1 < n && m[i][j] == '1' && m[i][j + 1] == '1') {
						ds.unite(n * i + j, n * i + j + 1);
					}
				}
			}
			Set<Integer> set = new HashSet<Integer>();
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(m[i][j] == '1') {
						set.add(ds.findSet(i * n + j));
					}
				}
			}
			System.out.println(set.size());
		}
		sc.close();
	}
	static class DisjointSet {
        int[] p;
        int[] rank;
        int[] size;
        DisjointSet(){}
        DisjointSet(int size){
            this.rank = new int[size];
            this.p = new int[size];
            this.size = new int[size];
            for(int i = 0; i < size; i++) {
                makeSet(i);
            }
        }
        void makeSet(int x) {
            p[x] = x;
            rank[x] = 0;
            size[x] = 1;
        }
        boolean same(int x, int y) {
            return findSet(x) == findSet(y);
        }
        void unite(int x, int y) {
            link(findSet(x), findSet(y));
        }
        void link(int x, int y) {
            if(rank[x]  > rank[y]) {
                p[y] = x;
                size[x] = size[x] + size[y];
            }else if(rank[x] < rank[y]){
                p[x] = y;
                size[y] = size[x] + size[y];
            }else if(x != y) {
            	p[y] = x;
            	rank[x]++;
            	size[x] = size[x] + size[y];
            }
        }
        int findSet(int x) {
            if(x != p[x]) {
                p[x] = findSet(p[x]);
            }
            return p[x];
        }
        int size(int x) {
        	if(x != p[x]) {
        		size[x] = size(findSet(x));
        	}
        	return size[x];
        }
    }
}
