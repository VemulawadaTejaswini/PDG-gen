import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int n = Integer.valueOf(line.split(" ")[0]);
		int q = Integer.valueOf(line.split(" ")[1]);
		
		Map<Integer, Node> nodes = new TreeMap<>();
		for(int i = 0; i < n; i++){
			nodes.put(i, new Node(i));
		}
		for(int i = 0; i < q; i++){
			String query = sc.nextLine();
			int com = Integer.valueOf(query.split(" ")[0]);
			int x = Integer.valueOf(query.split(" ")[1]);
			int y = Integer.valueOf(query.split(" ")[2]);
			
			switch(com){
				case 0:
					unite(nodes, x, y);
					break;
				case 1:
					System.out.println(same(nodes, x, y)? "1": "0");
					break;
			}
		}
	}
	
	static void unite(Map<Integer, Node> map, int x, int y){
		map.get(y).getRoot().setParent(map.get(x));
	}
	
	static boolean same(Map<Integer, Node> map, int x, int y){
		return map.get(x).getRoot().getNo() == map.get(y).getRoot().getNo();
	}
}

class Node{
	int no;
	Node parent;
	
	int getNo(){
		return no;
	}
	
	void setParent(Node n){
		this.parent = n;
		if(parent != this)this.parent.setParent(n.getRoot());
	}
	
	Node getRoot(){
		if(parent != this) return parent.getRoot();
		else return this;	
	}
	
	Node(int no){
		this.no = no;
		parent = this;
	}
}