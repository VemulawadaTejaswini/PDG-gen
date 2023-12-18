import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		DisjointSet ds = new DisjointSet(n);

		for(int i = 0; i < q; i++) {
			int com = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			if(com == 0) {
				ds.unite(x, y);
			}else if(com == 1) {
				if(ds.same(x, y)) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}
		}
		scan.close();
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
