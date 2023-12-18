import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			int []A = new int[M];
			int []B= new int[M];
			for(int i = 0;i<M;i++) {
				A[i] = scan.nextInt();
				B[i] = scan.nextInt();
			}
			
			GM[]map= new GM[N+1];
			for(int i = 1;i<=N;i++) {//1~N
				map[i] = new GM(i);
			}
			
			Map<Integer,ArrayList<Integer>>D= new TreeMap<Integer,ArrayList<Integer>>();
			for(int i = 1;i<=N;i++) {
				ArrayList<Integer> ed = new ArrayList<Integer>();
				D.put(i, ed);
			}
			
			
			
			for(int i = 0;i<M;i++) {
				D.get(A[i]).add(B[i]);
				D.get(B[i]).add(A[i]);
			}
			
			Deque<GM> stack = new ArrayDeque<GM>();
			stack.addFirst(map[1]);
			map[1].search = true;
			
			while(!stack.isEmpty()) {
				GM p = stack.removeLast();
				ArrayList<Integer> sk = D.get(p.num);
				for(Integer t:sk){				
					if(map[t].search==false) {
						stack.addFirst(map[t]);
						map[t].search = true;
						map[t].saisyou = p.num;
					}
				}
			}
			
			
			for(int i = 2;i<=N;i++) {
				if(map[i].saisyou==0) {
					System.out.println("No");
					System.exit(0);
				}
			}
			
			System.out.println("Yes");
			
			for(int i = 2;i<=N;i++) {
				System.out.println(map[i].saisyou);
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
	
	static class Edge{//向かう先の点to,と辺の重みwe。
		int to;  
		Edge(int T){
			to = T;	
		}
	}
	
	static class GM{
		boolean search = false;
		int saisyou = 0;
		int num;
		GM(int n){	
			num = n;
		}
	}
		
	
	
	
	
	
	
		

}
