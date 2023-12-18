import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stack{
	private final int SIZE = 20;
	private int[] st;
	private int top;
	public Stack(){
		st = new int[SIZE];
		top = -1;
	}
	public void push(int v){
		st[++top] = v;
	}
	public int pop(){
		return st[top--];
	}
	public int peek(){
		return st[top];
	}
	public boolean isEmpty(){
		return (top == -1);
	}
}
class Graph{
	private final int MAX_VERTS = 20;
	//?¨????????????°
	private boolean[] wasVisited;
	private int[] d,f;
	private int tt;
	private int adjMat[][];
	public int nVerts;
	private Stack stack;
	public Graph(){
		wasVisited = new boolean[MAX_VERTS];
		tt = 0;
		d = new int[MAX_VERTS];
		f = new int[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for(int i=0;i<MAX_VERTS;i++){
			wasVisited[i] = false;
			for(int j=0;j<MAX_VERTS;j++)
				adjMat[i][j] = 0;
		}
		stack = new Stack();
	}
	public void addEdge(int start,int end){
		adjMat[start][end] = 1;
	}
	public int getUnvisitedVertex(int v){
		for(int n=1;n<=nVerts;n++){
			if(adjMat[v][n] == 1 && wasVisited[n] == false)
				return n;
		}
		return -1;
	}
	public void dfs(){
		wasVisited[0] = true;
		d[0] = ++tt;
		stack.push(1);
		while(!stack.isEmpty()){
			//v???vertexList????????????????????????
			int v = getUnvisitedVertex(stack.peek());
			if(v==-1){
				int u = stack.peek() -1;
				f[u] = ++tt;
				stack.pop();
			}else {
				wasVisited[v] = true;
				d[v-1] = ++tt;
				stack.push(v);
			}
		}
		for(int i=0;i<nVerts;i++){
			System.out.println(i+1 +" "+d[i]+" "+f[i]);
		}
	}
}
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Graph graph = new Graph();
		int n = Integer.parseInt(br.readLine());
		graph.nVerts = n;
		for(int i=0;i<n;i++){
			String[] line = br.readLine().split(" ");
			for(int j=0;j<Integer.parseInt(line[1]);j++){
				//vn?????£??\?????????????????????????????????
				int vn = j+2;
				graph.addEdge(Integer.parseInt(line[0]), Integer.parseInt(line[vn]));
			}
		}
		graph.dfs();
	}
}