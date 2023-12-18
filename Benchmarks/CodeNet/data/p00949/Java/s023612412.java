import java.util.*;
public class Main{
	class Node{
		int[] a;
		int idx;
		int hash;
		public Node(int idx){
			this.idx = idx;
			this.a = new int[26];
			hash = 0;
		}
		public void add(char c){
			a[c - 'a']++;
			hash = (hash + magic[c - 'a']) % 1000000007;
		}
		
		public boolean equals(Object o){
			if(o == null) return false;
			if(!( o instanceof Node)) return false;
			Node nn = (Node)o;
			if(nn.hash != hash) return false;
			for(int i = 0; i < 26; i++){
				if(nn.a[i] != a[i]) return false;
			}
			return true;
		}
		public int hashCode(){
			return hash;
		}
	}
	
	int[] magic;
	public void solve(){
		Random rand = new Random();
		magic = new int[26];
		for(int i = 0; i < 26; i++){
			magic[i] = rand.nextInt(1000000007);
		}
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int len = Math.min(s1.length(), s2.length());
		Node[] n1 = new Node[s1.length()];
		Node[] n2 = new Node[s2.length()];
		for(int i = 0; i < s1.length(); i++){
			n1[i] = new Node(i);
		}
		for(int i = 0; i < s2.length(); i++){
			n2[i] = new Node(i);
		}
		int ans = -1;
		HashSet<Node> set = new HashSet<>();
		for(int i = 0; i < len; i++){
			set.clear();
			for(int j = 0; j < s1.length() - i; j++){
				n1[j].add(s1.charAt(i + j));
				set.add(n1[j]);
			}
			
			for(int j = 0; j < s2.length() - i; j++){
				n2[j].add(s2.charAt(i + j));
				if(i > ans && set.contains(n2[j])){
					ans = i;
				}
			}
		}
		
		System.out.println(ans + 1);
	}
	
	public static void main(String[] args){
		new Main().solve();
	}
}