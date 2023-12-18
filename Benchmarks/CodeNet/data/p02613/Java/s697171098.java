
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		PriorityQueue<String> pq = new PriorityQueue<>();

		for(int i=0; i < N; i++) {
			pq.add(sc.next());
		}
		
		int[]  C = new int[4];
		while(!pq.isEmpty()) {
			String word = pq.poll();
			switch(word) {
			case "AC":
				C[0] ++;
				break;
			case "WA":
				C[1] ++;
				break;
			case "TLE":
				C[2] ++;
				break;
			case "RE":
				C[3] ++;
				break;
			}
			
		}
		
		
		System.out.println("AC × " + C[0]);
		System.out.println("WA × " + C[1]);
		System.out.println("TLE × " + C[2]);
		System.out.println("RE × " + C[3]);


	}
}

