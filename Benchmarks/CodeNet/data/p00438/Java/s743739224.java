import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int a,b,n;
		int[][] node;
		while((((a=s.nextInt())|(b=s.nextInt()))!=0)) {
			n=s.nextInt();
			node = new int[a][b];
			for(int i=n;i>0;i--)
				node[Integer.parseInt(s.next())-1][Integer.parseInt(s.next())-1]=-1;
			node[node.length-1][node[0].length-1]=1;

			ArrayDeque<Point> deque = new ArrayDeque<Point>();

			deque.add(new Point(node.length-1, node[0].length-1));

			Point p,buf;
			while((p=deque.poll())!=null) {
				if(p.x!=0&&node[p.x-1][p.y]!=-1) {
					node[p.x-1][p.y]+=node[p.x][p.y];
					if(!deque.contains(buf = new Point(p.x-1, p.y))) {
						deque.addFirst(buf);
					}
				}
				if(p.y!=0&&node[p.x][p.y-1]!=-1) {
					node[p.x][p.y-1]+=node[p.x][p.y];
					if(!deque.contains(buf = new Point(p.x, p.y-1))) {
						deque.add(buf);
					}
				}
			}
			/*
			for(int[] z:node)
				System.out.println(Arrays.toString(z));
			*/
			System.out.println(node[0][0]);
		}
	}
}
class Point{
	int x,y;
	Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	@Override
	public boolean equals(Object obj) {
		Point p=(Point) obj;
		return p.x==x&&p.y==y;
	}
}