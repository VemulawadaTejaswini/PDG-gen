import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Dominoes Arrangement
public class Main{

	public static class N{
		public List<N> adj;
		public boolean visited;
		public N() {
			adj = new ArrayList<N>();
		}
		public void f(){
			if(visited)return;
			visited = true;
			for(N n:adj)n.f();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			N[] v = new N[14];
			for(int i=0;i<14;i++)v[i]=new N();
			while(n--!=0){
				char[] s = sc.next().toCharArray();
				int a = s[0]-'0';
				int b = s[1]-'0';
				if(b < a){
					int tmp = a;
					a = b;
					b = tmp;
				}
				v[a].adj.add(v[b+7]);
				v[b+7].adj.add(v[a]);
			}
			int odd = 0;
			for(int i=0;i<14;i++)odd+=v[i].adj.size()%2==1?1:0;
			if(!(odd==0||odd==2)){
				System.out.println("No");
				continue;
			}
			for(int i=0;i<14;i++){
				if(!v[i].adj.isEmpty()){
					v[i].f();
					break;
				}
			}
			boolean f = true;
			for(int i=0;i<14;i++){
				if(!v[i].adj.isEmpty()&&!v[i].visited){
					f = false;
					break;
				}
			}
			System.out.println(f?"Yes":"No");
		}
	}
}