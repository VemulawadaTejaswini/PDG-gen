import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		long K = stdIn.nextLong();
		ArrayDeque<Integer> A = new ArrayDeque<Integer>();
		ArrayDeque<Integer> B = new ArrayDeque<Integer>();
		
		for(int i = 0; i < N; i ++) {
			A.addLast(stdIn.nextInt());
		}
		for(int i = 0; i < M; i ++) {
			B.addLast(stdIn.nextInt());
		}
		
		long time = 0;
		long ans = 0;
		
		while(true) {
			long addTime = 0;
			boolean flagA = false;
			boolean flagB = false;
			if(A.size() != 0 && B.size() != 0) {
				if(A.getFirst() <= B.getFirst()) {
					addTime = A.getFirst();
					flagA = true;
				}else {
					addTime = B.getFirst();
					flagB = true;
				}
			}else if(A.size() != 0 && B.size() == 0) {
				addTime = A.getFirst();
				flagA = true;
			}else if(A.size() == 0 && B.size() != 0) {
				addTime = B.getFirst();
				flagB = true;
			}else {
				break;
			}
			if(time + addTime <= K) {
				time += addTime;
				ans ++;
				if(flagA) {
					A.removeFirst();
				}
				if(flagB) {
					B.removeFirst();
				}
			}else {
				break;
			}
			
		}
		
		System.out.println(ans);
	}
}