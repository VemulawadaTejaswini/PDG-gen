import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
   
   
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node[] node = new Node[n];
		Node[] Tmp  = new Node[n];
		for(int i = 0; i < n; i++) {
			node[i] = new Node();
			Tmp[i] = new Node();
			Tmp[i].id = node[i].id;
			Node.ID--;
		}
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			node[a].out.add(node[b]);
			node[b].in.add(node[a]);
			Tmp[a].out.add(Tmp[b]);
			Tmp[b].in.add(Tmp[a]);
		}
		
		ArrayList<Node> L = new ArrayList<Node>();
		ArrayList<Node> S = new ArrayList<Node>();
		for(int i = 0; i < n; i++) {
			if(node[i].in.isEmpty()) S.add(node[i]);
		}
		while(!S.isEmpty()) {
			Node tmp = S.get(0);
			S.remove(0);
			L.add(tmp);
			while(!tmp.out.isEmpty()) {
				Node to = tmp.out.get(0);
				tmp.out.remove(0);
				to.in.remove(tmp);
				if(to.in.isEmpty()) {
					S.add(to);
				}
			}
		}
		int[] color = new int[n];
		for(int i = 0; i < L.size(); i++) {
			System.out.println(L.get(i).id);
			for(int j = 0; j < Tmp[L.get(i).id-1].out.size(); j++) {
				color[Tmp[L.get(i).id-1].out.get(j).id-1] = Math.max(color[Tmp[L.get(i).id-1].out.get(j).id-1], color[L.get(i).id-1]+1);
			}
		}
		
		int[] count = new int[n];
		
		for(int i = 0; i < n; i++) {
			//System.out.println(color[i]);
			count[color[i]]++;
		}
		Arrays.sort(count);
		
		System.out.println(((count[n-1] >= 2)?1:0));
		
		
		
		
		
		
		
		
		
	}
	
	static class Node {
		static int ID = 1;
		int id = ID++;
		ArrayList<Node> out = new ArrayList<Node>();
		ArrayList<Node> in  = new ArrayList<Node>();
	}

	
}