import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main {public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Queue<String> name = new ArrayDeque<>();
		Queue<Integer> time = new ArrayDeque<>();
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			name.add(sc.next());
			time.add(sc.nextInt());
		}
		
		int t = 0;
		while(!name.isEmpty()) {
			String tmpname = name.poll();
			int tmptime = time.poll();
			
			if(tmptime - q <= 0) {
				t += tmptime;
				System.out.println(tmpname + " " + t);
			}else {
				t += q;
				name.add(tmpname);
				time.add(tmptime - q);
			}
		}
	}
}
