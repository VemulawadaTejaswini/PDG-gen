import java.util.*;
public class Main {
	boolean isPrime(int num) {
		if(num == 1) return(false);
		for(int r = 2; r <= Math.sqrt(num); r++) {
			if(num % r == 0) return(false);
		}
		return(true);
	}
	
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int N = stdIn.nextInt();
			int P = stdIn.nextInt();
			if(N == -1 && P == -1) break;
			
			ArrayList<Integer> list = new ArrayList<Integer>(100);
			for(int r = N; list.size() < 100; r++) {
				if(isPrime(r)) list.add(r);
			}
		
			for(int r = 0; r < list.size(); r++) {
				if(list.get(r) > N) { 
					N = r; //添字にする 
					break;
				}
			}
			
			ArrayList<Integer> output = new ArrayList<Integer>();
			for(int r = N; r < list.size(); r++) {
				for(int c = r; c < list.size(); c++) {
					output.add(list.get(r) + list.get(c));
				}
			}
			Collections.sort(output);
			System.out.println(output.get(P - 1));
		}
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}