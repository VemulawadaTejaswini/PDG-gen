import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		ArrayList<ArrayDeque<Integer>> ar = new ArrayList<>();
		for (int i=0; i<n; i++) ar.add(new ArrayDeque<>());
		int m = sc.nextInt();
		for (int i=0; i<m; i++) {
			int mode = sc.nextInt();
			if (mode == 0) {
				ar.get(sc.nextInt()).addLast(sc.nextInt());
			}
			else if (mode == 1) {
				int temp = sc.nextInt();
				if (ar.get(temp).peekFirst() != null) System.out.println(ar.get(temp).getFirst());
			}
			else if (mode == 2) {
				int temp = sc.nextInt();
				if (ar.get(temp).peekFirst() != null) ar.get(temp).removeFirst();
			}
		}
		
	}
}
