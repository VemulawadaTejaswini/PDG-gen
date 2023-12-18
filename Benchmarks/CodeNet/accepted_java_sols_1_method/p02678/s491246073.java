import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	List<List<Integer>> list = new ArrayList<>();
    	for (int i = 0; i < N; i++) {
    		list.add(new ArrayList<>());
    	}
    	for (int i = 0; i < M; i++) {
    		int A = sc.nextInt()-1;
    		int B = sc.nextInt()-1;
    		list.get(A).add(B);
    		list.get(B).add(A);
    	}
    	int[] res = new int[N];
    	Arrays.fill(res, -1);
    	Queue<Integer> que = new ArrayDeque<>();
    	res[0] = 0;
        que.offer(0);
        while(!que.isEmpty()) {
            int room = que.poll();
            for(int hasNum : list.get(room)) {
                if(res[hasNum] != -1) {
                	continue;
                }
                res[hasNum] = room + 1;
                que.offer(hasNum);
            }
        }
        StringBuilder sb = new StringBuilder();
        System.out.println("Yes");
        for(int i = 1; i < res.length; i++) {
            sb.append(res[i] + "\n");
        }
        System.out.print(sb);
    }
}