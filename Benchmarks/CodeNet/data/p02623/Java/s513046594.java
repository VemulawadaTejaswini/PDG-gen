import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			int K = scan.nextInt();
			int[]A = new int[N];
			int[]B = new int[M];
			Deque<Integer>ade = new ArrayDeque<Integer>();
			Deque<Integer>bde = new ArrayDeque<Integer>();
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				ade.addFirst(A[i]);
			
			}
			for(int i = 0;i<M;i++) {
					B[i] = scan.nextInt();
					bde.addFirst(B[i]);
			}
			
			long time=0;
			int count = 0;
			
			while(true) {
				
				if(ade.isEmpty()&&bde.isEmpty()) {
					break;
				}else if(ade.isEmpty()) {
					time+=bde.pollLast();
					count++;	
				}else if(bde.isEmpty()) {
					time+=ade.pollLast();
					
					count++;
				}else {
					int ase = ade.peekLast();
					int bse = bde.peekLast();
					if(ase<=bse){
						time+=ade.pollLast();
						count++;
					}else{
						time+=bde.pollLast();
						count++;
					}
				}
				//System.out.println(time);
				
				if(time>K) {
					count--;
					break;
				}
				
			}
			
			
			System.out.println(count);
			
			
			
			
		}
		
		
	}
	
		

}
