
import java.util.*;

class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<N; i++) {
			list.add(sc.nextInt());
		}
		int d = 0;
		while(true) {
			if(!list.contains(X-d)) {
				System.out.println(X-d);
				break;
			}
			if(!list.contains(X+d)) {
				System.out.println(X+d);
				break;
			}
			d ++;
		}
		
		
	}

}


