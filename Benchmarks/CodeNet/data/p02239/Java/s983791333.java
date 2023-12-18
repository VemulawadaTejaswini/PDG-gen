
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		AdjacencyMatrices am = new AdjacencyMatrices(scan.nextInt());
		am.readList(scan);
		Graph graph = new Graph(am.getMatrix());
		graph.nearest();
		//graph.bfs(16);

	}

}
class Graph{
	ArrayList<Node> vertices;
	public Graph(int[][] matrix){
		vertices = new ArrayList<Node>();
		for(int i=0; i<matrix.length;i++)
			vertices.add(new Node(i+1));
		for(int i=0; i<matrix.length;i++)
			for(int j=0; j<matrix.length; j++)
				if(matrix[i][j]!=0)
					vertices.get(i).addNext(vertices.get(j));
	}
	void walk(){
		int time = 0;
		for(int i=0; i<vertices.size();i++){
			time = vertices.get(i).walk(time);
		}
	}
	void nearest(){	
		for(int i=0; i<vertices.size();i++)
			System.out.println((i+1) + " " + bfs(i+1));
	}
	void clearHistory(){
		for(int i=0; i<vertices.size();i++)
					vertices.get(i).disSteped();	
	}
	void print(){

		for(int i=0; i<vertices.size();i++)
			vertices.get(i).result();
	}

	int bfs(int target){
		ArrayDeque<Node> queue = new ArrayDeque<Node>();
		clearHistory();
		queue.addFirst(vertices.get(0));
		int dist = 0;
		int childCount = 1;
		int nextChildrenCount=0;
		while(!queue.isEmpty()){
			Node temp = queue.removeLast();
			if(temp.id==target)
				return dist;
			childCount--;

			for(Node n : temp.nextNode){
				if(!n.steped){
					n.steped = true;
					nextChildrenCount++;
					queue.addFirst(n);
				}
			}
			if(childCount==0){
				dist++;
				childCount = nextChildrenCount;
				nextChildrenCount=0;
			}
			//System.out.println("queue size : " + queue.size());
		}
		return -1;

	}
}

class Node{
	int id;
	int startTime;
	int endTime;
	boolean steped = false;
	ArrayList<Boolean> stepedNext = new ArrayList<Boolean>(); 
	ArrayList<Node> nextNode = new ArrayList<Node>();
	public Node(int id){
		this.id = id;
	}
	public void addNext(Node n){
		nextNode.add(n);
		stepedNext.add(false);
	}
	public void disSteped(){
		this.steped = false;
	}
	public int bfs(ArrayDeque<Node> queue, int step, int target){
		Node node = queue.removeLast();

		System.out.println("bfs_id : " + node.id);
		node.steped = true;
		if(node.id == target){
			System.out.println("find");
			return 0;
		}
		for(Node n : node.nextNode)
			if(!n.steped)
				queue.addFirst(n);
		for(Node n : node.nextNode){
			
			if(!n.steped){
				System.out.println("bfs, id :  " + n.id + ", steped : "+ n.steped);
				int temp = n.bfs(queue, step + 1, target);
			
				if(temp >=0 ){
					System.out.println("gt 0");
					return temp+1;
				}else{
					System.out.println("-1");
				}
			}
		}
		return -1;
	}
	public int walk(int time){
		if(this.steped)
			return time;
		time++;//
		this.startTime = time;
		this.steped = true;
		int end = time;
		for(int i=0; i<stepedNext.size(); i++){
			time = nextNode.get(i).walk(time);
		}
		time++;//
		this.endTime = time;
		return endTime;
	}
	boolean remainNext(){
		return stepedNext.contains(false);
	}
	void result(){
		System.out.println(this.id + " " + startTime + " " + endTime);
	}
}
class AdjacencyMatrices{
	int pointNum;
	int[][] matrix;
	public AdjacencyMatrices(int n){
		pointNum = n;
		matrix = new int[n][];
		for(int i=0; i<n; i++)
			matrix[i] = new int[n];
	}
	public void readList(Scanner scan){
		for(int i=0; i<pointNum; i++){
			int index = scan.nextInt()-1;
			int dim = scan.nextInt();
			for(int j=0; j< dim; j++)
				matrix[index][scan.nextInt()-1] = 1;
		}
	}
	public int[][] getMatrix(){
		return matrix;
	}
	public void printMatrix(){
		StringBuilder temp = new StringBuilder();
		for(int i=0; i<pointNum; i++){
			for(int j=0; j<pointNum; j++){
				temp.append(matrix[i][j]);
				if(j!=pointNum-1)
					temp.append(" ");
			}
			temp.append("\n");
		}
		System.out.print(new String(temp));
	}

}