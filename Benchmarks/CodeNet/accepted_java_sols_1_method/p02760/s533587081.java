import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] A = new int[9];
		for (int i=0; i<9; i++) {
			A[i] = in.nextInt();
		}
		int N = in.nextInt();
		int[] b = new int[N];
		for (int i=0; i<N; i++) {
			b[i] = in.nextInt();
		}
		
		boolean flag = false;
		
		ArrayList<Integer> hit = new ArrayList<Integer>();
		
		for (int i=0; i<9; i++) {
			for (int j =0; j<N; j++) {
				
				if (A[i] == b[j]) {
					hit.add((i+1));
				}
				
			}
		}
		
		if((hit.contains(1) && hit.contains(2) && hit.contains(3)) || (hit.contains(4) && hit.contains(5) && hit.contains(6)) || (hit.contains(7) && hit.contains(8) && hit.contains(9))) {
			flag = true;
		}
		
		if((hit.contains(1) && hit.contains(4) && hit.contains(7)) || (hit.contains(2) && hit.contains(5) && hit.contains(8)) || (hit.contains(3) && hit.contains(6) && hit.contains(9))) {
			flag = true;
		}
		
		if((hit.contains(1) && hit.contains(5) && hit.contains(9)) || (hit.contains(3) && hit.contains(5) && hit.contains(7))) {
			flag = true;
		}
		
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
