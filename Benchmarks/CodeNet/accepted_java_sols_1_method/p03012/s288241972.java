import java.util.*;
public class Main {
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> W = new ArrayList<>();
	    for (int i = 0; i < N; i++) {
	      W.add(sc.nextInt());
	    }
		sc.close();

		Integer A = 0;
		Integer B = 0;

		while (W.size() != 0) {
			if(A < B){
				A += W.get(0);
				W.remove(0);
			} else {
				B += W.get(W.size() - 1);
				W.remove(W.size() - 1);
			}
		}
		
		System.out.println(Math.abs(A-B));
	
	}
}