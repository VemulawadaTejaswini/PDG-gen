import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Node {
	private ArrayList<Node> from = new ArrayList<Node>();
	private ArrayList<Node> to = new ArrayList<Node>();
	
	public void addDestination(Node e){
		if( !to.contains(e) ) {
			to.add(e);
		}
	}
	
	public void addSource(Node e){
		if( !from.contains(e) ){
			from.add(e);
		}
	}
	
	public ArrayList<Node> getTo(){
		return (ArrayList<Node>)to.clone();
	}
	
	public int getFromSize(){
		return from.size();
	}
	
}

class Main
{
	ArrayList<Node> nodes = new ArrayList<Node>();
	ArrayList<Node> visited = new ArrayList<Node>();
	ArrayList<Integer> answer = new ArrayList<Integer>();
	
	private void input(){
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		
		for(int i = 0; i < m; ++i){
			nodes.add(new Node());
		}
		
		for(int i = 0; i < n; ++i){
			int from, to;
			
			from = sc.nextInt() - 1;
			to = sc.nextInt() - 1;
			
			nodes.get(from).addDestination(nodes.get(to));
			nodes.get(to).addSource(nodes.get(from));
		}
		
	}

	private void output()
	{
		for(int i : answer ) {
			System.out.println( i );
		}
	}
	
	private void solve() {
		for(Node start : nodes) {
			if( start.getFromSize() == 0 ) {
				dfs( start );
			}
		}
		
		Collections.reverse( answer );
	}

	public static void main(String [] args)
	{
		Main solver = new Main();
		solver.input();
		solver.solve();
		solver.output();
	}
	
	private void dfs(Node x) {
		if( visited.contains(x) ) return ;
		visited.add(x);
		for(Node to : x.getTo()){
			dfs( to );
		}
		answer.add(1+nodes.indexOf(x));
	}
}