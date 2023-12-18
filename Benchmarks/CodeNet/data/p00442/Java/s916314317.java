
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	static int N,M;
	static boolean[] visited;
	static List[] list = new List[N];
	static Stack<Integer>ans=new Stack<Integer>();
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		visited=new boolean[N];
		list = new List[N];
		for(int i=0;i<N;i++){
			list[i]=new LinkedList<Integer>();
		}
		int[] in = new int[N];
		for(int i=0;i<M;i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			list[a].add(b);
			in[b]++;
		}
		
		for(int i=0;i<N;i++){
			if(in[i]==0){
				dfs(i);
			}
		}
		Integer[] a = ans.toArray(new Integer[0]);
		reverse(a);
		boolean f = false;
		for(int i=0;i<N-1;i++){
			boolean ok = true;
			for(Object jj:list[a[i]]){
				Integer j=(Integer)jj;
				if(a[i+1]==j){
					ok = false;
				}
			}
			f|=ok;
		}
		while(!ans.isEmpty()){
			
			System.out.println(ans.pop()+1);
		}
		System.out.printf("%d\n",f?1:0);

	}
	static void reverse(Integer[] a){
		int left=0,right=a.length-1;
		for(;left<right;){
			int tmp=a[left];
			a[left]=a[right];
			a[right]=tmp;
			left++;right--;
			
		}
				
	}
	static void dfs(int num){
		visited[num]=true;
		for(Object i:list[num]){
			if(!visited[(Integer)i])dfs((Integer)i);
		}
		ans.add(num);
	}
}