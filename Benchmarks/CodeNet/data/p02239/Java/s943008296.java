import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Queue{
	private final int SIZE = 100;
	private int[] queArray;
	private int front;
	private int rear;
	public Queue(){
		queArray = new int[SIZE];
		front = 0;
		rear = -1;
	}
	public void insert(int j){
		if(rear == SIZE-1)
			rear = -1;
		queArray[++rear] = j;
	}
	public int remove(){
		int temp = queArray[front++];
		if(front == SIZE)
			front = 0;
		return temp;
	}
	public boolean isEmpty(){
		return (rear+1==front || (front+SIZE-1 == rear));
	}
}

class Graph{
	private final int MAX_VERTS = 101;
	//?¨????????????°
	private boolean[] wasVisited;
	private int[] distance;
	private int d;
	private int adjMat[][];
	public int nVerts;
	private Queue que;
	public Graph(){
		wasVisited = new boolean[MAX_VERTS];
		distance = new int[MAX_VERTS];
		d = 0;
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for(int i=0;i<MAX_VERTS;i++){
			wasVisited[i] = false;
			for(int j=0;j<MAX_VERTS;j++)
				adjMat[i][j] = 0;
		}
		que = new Queue();
	}
	public void addEdge(int start,int end){
		adjMat[start][end] = 1;
	}
	public int getUnvisitedVertex(int v){
		for(int n=1;n<=nVerts;n++){
			if(adjMat[v][n] == 1 && wasVisited[n-1] == false)
				return n;
		}
		return -1;
	}
	public void bfs(int v){
		wasVisited[v-1] = true;
		que.insert(v);
		distance[v-1] = d;
		int v2;
		while(!que.isEmpty()){
			int v1 = que.remove();
			while((v2 = getUnvisitedVertex(v1)) != -1){
				que.insert(v2);
				wasVisited[v2-1] = true;
				distance[v2-1] = distance[v1-1]+1;
			}
		}
		for(int i=0;i<nVerts;i++)
			System.out.println(i+1 + " " + distance[i]);
		
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
				graph.addEdge(Integer.parseInt(line[0]), Integer.parseInt(line[j+2]));
			}
		}
		graph.bfs(1);
	}
}