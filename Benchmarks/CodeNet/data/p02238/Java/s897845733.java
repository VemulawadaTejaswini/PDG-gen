import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] graph = new int[n][n];
		int[][] arr = new int[n][2];
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i=1;i<=n;i++){
			int u = sc.nextInt();
			int k = sc.nextInt();
			for(int j=1;j<=k;j++){
				int index = sc.nextInt();
				graph[u-1][index-1]=1;
			}
		}
		
		s.push(1);
		arr[0][0]=1;
		int index=2;
		
		while(s.size()>0){
			int num = s.peek();
			boolean val = false;
			for(int i=0;i<n;i++){
				if(graph[num-1][i]==1 && arr[i][0]==0){
					s.push(i+1);
					arr[i][0]=index;
					index++;
					val = true;
				}
			}
			if(!val){
				int number = s.pop();
				arr[number-1][1] = index;
				index++;
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.println((i+1)+" "+arr[i][0]+" "+arr[i][1]);
		}
	}
}
