import java.util.Scanner;
import java.util.Stack;

public class Main {

	/**
	 * @param args
	 */
	static Food[] f,ans;
	static int n;
	static double min;
	static Stack<Food> stack;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true){
			n=cin.nextInt();
			if(n==0)break;
			f=new Food[n];
			ans=new Food[n];
			min=1<<30;
			stack=new Stack<Food>();
			for(int i=0;i<n;i++){
				f[i]=new Food(cin.next(),cin.nextInt(),cin.nextInt());
			}
//			Arrays.sort(f);
			dfs(0,0);
			for(int i=0;i<n;i++){
				System.out.println(ans[i].name);
			}
		}
		
	}
	static void dfs(int sum,int depth){
//		System.out.println(sum+" "+depth);
		if(depth==n){
			int ue=0,sita=0;
			int cnt=n;
			for(Food food:stack){
				ue+=food.w*cnt;
				sita+=food.w;
				cnt--;
			}
			if(min>(double)ue/(double)sita){
				min=(double)ue/(double)sita;
				cnt=n-1;
				for(Food food:stack){
					ans[cnt--]=food;
				}
			}
			return;
		}
		for(int i=0;i<f.length;i++){
			if(f[i].f)continue;
			if(sum<=f[i].s){
				f[i].f=true;
				stack.add(f[i]);
				dfs(sum+f[i].w,depth+1);
				stack.pop();
				f[i].f=false;
			}
		}
	}
	static class Food implements Comparable<Food>{
		String name;
		int w,s;
		boolean f;
		Food(String s,int a,int b){
			name=s;
			w=a;
			this.s=b;
			f=false;
		}
		@Override
		public int compareTo(Food o) {
			
			return this.s-o.s;
		}
	}
}