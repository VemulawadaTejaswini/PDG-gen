import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static long mod = 1000000007;
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int M = s.nextInt();
	int[] A = new int[M];
	int[] B = new int[M];
	
	for(int i = 0; i < M; i++){
		A[i] = s.nextInt()-1;
	    B[i] = s.nextInt()-1;
	}
	
	List<List<Integer>> list = new ArrayList<>();
	for(int i = 0; i < N; i++){
		list.add(new ArrayList<Integer>());
	}

	for(int i = 0; i < M; i++){
		list.get(A[i]).add(B[i]);
		list.get(B[i]).add(A[i]);
	}

	Queue<Integer> queue = new ArrayDeque<Integer>();
	int maxCount = 0;
	boolean[] isVisit = new boolean[N]; 
	for(int i = 0; i < N; i++){
		if(isVisit[i]) continue;
		int count = 0;
		isVisit[i] = true;
		queue.add(i);
		while(queue.peek() != null){
			int v = queue.poll();
			count++;
			for(int j = 0; j < list.get(v).size(); j++){
				if(!isVisit[list.get(v).get(j)]){
					isVisit[list.get(v).get(j)] = true;
					queue.add(list.get(v).get(j));
				}
			}
		}
		maxCount = Math.max(count, maxCount);
	}


	System.out.println(maxCount);

    
  }
}