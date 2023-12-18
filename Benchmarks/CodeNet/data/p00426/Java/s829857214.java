import java.util.Scanner;
import java.util.Stack;

//Cup
public class Main{

	public static int n;
	public static Stack<Integer>[] cup;
	public static int ans;

	//ope
	//1: A->B
	//2: C->B
	//-1:B->A
	//-2:B->C
	public static void dfs(int pre, int k){
		if(ans <= k)return;
		if(cup[0].size()==n || cup[2].size()==n){
			ans = Math.min(ans, k);
			return;
		}
		if(pre!=1){
			if(!cup[1].empty()){
				if(cup[0].empty() || cup[0].peek() < cup[1].peek()){
					cup[0].push(cup[1].pop());
					dfs(-1, k+1);
					cup[1].push(cup[0].pop());
				}
			}
		}
		if(pre!=-1){
			if(!cup[0].empty()){
				if(cup[1].empty() || cup[1].peek() < cup[0].peek()){
					cup[1].push(cup[0].pop());
					dfs(1, k+1);
					cup[0].push(cup[1].pop());
				}
			}
		}
		if(pre!=2){
			if(!cup[1].empty()){
				if(cup[2].empty() || cup[2].peek() < cup[1].peek()){
					cup[2].push(cup[1].pop());
					dfs(-2, k+1);
					cup[1].push(cup[2].pop());
				}
			}
		}
		if(pre!=-2){
			if(!cup[2].empty()){
				if(cup[1].empty() || cup[1].peek() < cup[2].peek()){
					cup[1].push(cup[2].pop());
					dfs(2, k+1);
					cup[2].push(cup[1].pop());
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0&&m==0)break;
			ans = m+1;
			cup = new Stack[3];
			for(int i=0;i<3;i++)cup[i] = new Stack<Integer>();
			for(int i=0;i<3;i++){
				int k = sc.nextInt();
				while(k--!=0)cup[i].push(sc.nextInt());
			}
			dfs(0, 0);
			System.out.println(ans==m+1?-1:ans);
		}
	}
}