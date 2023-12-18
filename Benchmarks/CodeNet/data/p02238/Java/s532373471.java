
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		AdjacencyMatrices am = new AdjacencyMatrices(scan.nextInt());
		am.readList(scan);
		Graph graph = new Graph(am.getMatrix());
		graph.walk();
		graph.print();
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
	void print(){
		for(int i=0; i<vertices.size();i++)
			vertices.get(i).result();
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