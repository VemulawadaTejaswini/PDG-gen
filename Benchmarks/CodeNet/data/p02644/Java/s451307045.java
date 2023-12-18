import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;
/*
3 5 2
3 2 3 4
.....
.@..@
..@..

 */
public class Main {

	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int h=fs.nextInt(), w=fs.nextInt(), jumpDist=fs.nextInt();
		int startY=fs.nextInt()-1, startX=fs.nextInt()-1, endY=fs.nextInt()-1, endX=fs.nextInt()-1;
		TreeSet<Integer>[] onX=new TreeSet[w];
		TreeSet<Integer>[] onY=new TreeSet[h];
//		for (int x=0; x<w; x++) onX[x]=new TreeSet<>();
//		for (int y=0; y<h; y++) onY[y]=new TreeSet<>();
		
		
		ArrayList<Integer>[] onXArray=new ArrayList[w];
		for (int x=0; x<w; x++) onXArray[x]=new ArrayList<>();
		ArrayList<Integer>[] onYArray=new ArrayList[h];
		for (int y=0; y<h; y++) onYArray[y]=new ArrayList<>();
		boolean[][] board=new boolean[w][h];
		for (int y=0; y<h; y++) {
			char[] line=fs.next().toCharArray();
			for (int i=0; i<line.length; i++) {
				board[i][y]=line[i]!='@';
				if (board[i][y]) {
					onXArray[i].add(y);
					onYArray[y].add(i);
				}
			}
		}
		for (int x=0; x<w; x++) onX[x]=new TreeSet<>(onXArray[x]);
		for (int y=0; y<h; y++) onY[y]=new TreeSet<>(onYArray[y]);
		
		int[][][] maxJump=new int[w][h][4];
		for (int x=0; x<w; x++) {
			for (int y=0; y<h; y++) {
				if (!board[x][y]) maxJump[x][y][0]=-1;
				else {
					if (y==0) maxJump[x][y][0]=0;
					else maxJump[x][y][0]=Math.min(jumpDist, maxJump[x][y-1][0]+1);
				}
			}
			
			for (int y=h-1; y>=0; y--) {
				if (!board[x][y]) maxJump[x][y][1]=-1;
				else {
					if (y==h-1) maxJump[x][y][1]=0;
					else maxJump[x][y][1]=Math.min(jumpDist, maxJump[x][y+1][1]+1);
				}
			}
		}
		
		for (int y=0; y<h; y++) {
			for (int x=0; x<w; x++) {
				if (!board[x][y]) maxJump[x][y][2]=-1;
				else {
					if (x==0) maxJump[x][y][2]=0;
					else maxJump[x][y][2]=Math.min(jumpDist, maxJump[x-1][y][2]+1);
				}
			}
			
			for (int x=w-1; x>=0; x--) {
				if (!board[x][y]) maxJump[x][y][3]=-1;
				else {
					if (x==w-1) maxJump[x][y][3]=0;
					else maxJump[x][y][3]=Math.min(jumpDist, maxJump[x+1][y][3]+1);
				}
			}
		}
		ArrayDeque<Integer> xs=new ArrayDeque<>();
		ArrayDeque<Integer> ys=new ArrayDeque<>();
		xs.addLast(startX);
		ys.addLast(startY);
		onX[startX].remove(startY);
		onY[startY].remove(startX);
		int[][] dist=new int[w][h];
		for (int x=0; x<dist.length; x++) Arrays.fill(dist[x], -1);
		dist[startX][startY]=0;
		while (!xs.isEmpty()) {
			int curX=xs.removeFirst(), curY=ys.removeFirst();
//			System.out.println("At "+curX+" "+curY+" "+dist[curX][curY]);
			//up
			{
				Integer aboveY=onX[curX].floor(curY);
				while (aboveY!=null && curY-aboveY<=maxJump[curX][curY][0]) {
					onX[curX].remove(aboveY);
					onY[aboveY].remove(curX);
					xs.addLast(curX);
					ys.addLast(aboveY);
					dist[curX][aboveY]=dist[curX][curY]+1;
					aboveY=onX[curX].floor(curY);
				}
			}
			//down
			{
				Integer belowY=onX[curX].ceiling(curY);
				while (belowY!=null && belowY-curY<=maxJump[curX][curY][1]) {
					onX[curX].remove(belowY);
					onY[belowY].remove(curX);
					xs.addLast(curX);
					ys.addLast(belowY);
					dist[curX][belowY]=dist[curX][curY]+1;
					belowY=onX[curX].ceiling(curY);
				}
			}
			
			//left
			{
				Integer aboveX=onY[curY].floor(curX);
				while (aboveX!=null && curX-aboveX<=maxJump[curX][curY][2]) {
					onY[curY].remove(aboveX);
					onX[aboveX].remove(curY);
					xs.addLast(aboveX);
					ys.addLast(curY);
					dist[aboveX][curY]=dist[curX][curY]+1;
					aboveX=onY[curY].floor(curX);
				}
			}
			//right
			{
				Integer belowX=onY[curY].ceiling(curX);
				while (belowX!=null && belowX-curX<=maxJump[curX][curY][3]) {
					onY[curY].remove(belowX);
					onX[belowX].remove(curY);
					xs.addLast(belowX);
					ys.addLast(curY);
					dist[belowX][curY]=dist[curX][curY]+1;
					belowX=onY[curY].ceiling(curX);
				}
			}
		}
		
//		for (int y=0; y<h; y++) {
//			for (int x=0; x<w; x++) {
//				System.out.print(dist[x][y]+" ");
//			}
//			System.out.println();
//		}
		System.out.println(dist[endX][endY]);
	}

	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

	
}
