import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0262().doIt();
	}

	class AOJ0262{
		int max,n;
		int[] masu;
		boolean search[];
		
		void dfs(int index){
			if(index<=0)index = 0;
			if(index>n)index = n+1;
			if(search[index])return;
			search[index] = true;
			for(int i=1;i<=max;i++){
				dfs(i+index+masu[i+index]);
			}
		}
		
		void doIt(){
			while(true){
				max = in.nextInt();
				if(max==0)break;
				n = in.nextInt();
				masu = new int[n+300];
				boolean sw[] = new boolean[max];
				for(int i=1;i<=n;i++)masu[i] = in.nextInt();
				for(int i=1;i<=max;i++){
					search = new boolean[n+2];
					dfs(i+masu[i]);
					sw[i-1] = search[n+1];
				}
				boolean a = true;
				for(int i=0;i<max;i++)if(sw[i]==false)a = false;
				System.out.println(a? "OK":"NG");
			}
		}
	}

}