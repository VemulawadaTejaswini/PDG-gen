import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N - 1];
		int[] B = new int[N - 1];
		int[] degree = new int[N];
		Arrays.fill(degree, 0);
		
		for(int i = 0; i < N - 1; i++){
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
			degree[A[i]]++;
			degree[B[i]]++;
		}
		
		int max = -1;
		for(int i = 0; i < N - 1; i++){
			max = Math.max(degree[i], max);
		}
		System.out.println(max);

		ArrayList<ArrayList<Integer>> vertexes = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < N; i++){
			ArrayList<Integer> v = new ArrayList<Integer>();
			vertexes.add(v);
		}
		
		for(int i = 0; i < N - 1; i++){
			vertexes.get(A[i]).add(B[i]);
			vertexes.get(B[i]).add(A[i]);
		}

		boolean[] seen = new boolean[N];
		Arrays.fill(seen, false);
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		int[] color = new int[N];
		Arrays.fill(color, 0);
		
		Map<Integer, Map<Integer,Integer>> map = new HashMap<Integer, Map<Integer,Integer>>();
		
		queue.add(0);
		seen[0] = true;
		while(!queue.isEmpty()){
			int x = queue.poll();
			int c = color[x];
			map.put(x , new HashMap<Integer,Integer>());
			ArrayList<Integer> v = vertexes.get(x);
			for(int i = 0; i < v.size(); i++){
				if(!seen[v.get(i)]){
					queue.add(v.get(i));
					seen[v.get(i)] = true;
					c = (c + 1) % max;
					map.get(x).put(v.get(i), c);
					color[v.get(i)] = c;
				}
			}
		}
		for(int i = 0; i < N - 1; i++){
			System.out.println(map.get(A[i]).get(B[i]) + 1);
		}
	}
}