import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        ArrayList<Integer>[] list = new ArrayList[n];
        for(int i=0;i<n;i++){
            ArrayList<Integer> sublist =  new ArrayList<>();
            list[i] = sublist;
        }

        for(int i=0;i<m;i++){
            int u = scan.nextInt() - 1;
            int v = scan.nextInt() - 1;
						list[u].add(v);
						list[v].add(u);
        }

        Queue<Integer> queue = new ArrayDeque<>();

				queue.add(0);

				int[] visit =  new int[n];
				visit[0]=1;
				int[] bef =  new int[n];

        while(!queue.isEmpty()){
					int from = queue.poll();
						for (int i=0;i<list[from].size();i++){
							int lf = list[from].get(i);
							if ( visit[lf] == 0){
								bef[lf] = from;
								visit[lf] = 1;
								queue.add(lf);
							}
						}
				}
				
				System.out.println("Yes");
				for(int i=1;i<bef.length;i++){
					System.out.println(bef[i]+1);
				}

    }
}
