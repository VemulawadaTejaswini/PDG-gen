
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Queue <String> N = new LinkedList<>();
		Queue <Integer> Q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
		int task = sc.nextInt();	

		for(int i = 0; i < n; i++) {
			N.add(sc.next());
			Q.add(sc.nextInt());
		}
		sc.close();
		
		Queue <String> N_ans = new LinkedList<>();
		Queue <Integer> Q_ans = new LinkedList<>();
		
		
		int time = 0;
		int R = 0;
		String S = "";
		while (!Q.isEmpty()) {
			R = Q.poll();
			S = N.poll();
			if (R>task){
				R-=task;
				Q.add(R);
				N.add(S);
				time+=task;
			}
			else {
				time+=R;
				Q_ans.add(time);
				N_ans.add(S);
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(N_ans.poll() + " ");
			System.out.println(Q_ans.poll());
		}
	}

}

