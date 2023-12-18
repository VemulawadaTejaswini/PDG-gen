import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		for (int i=0; i<n; i++) {

			for (int j=0; j<=i; j++) {
				if (list.get(i) <= list.get(j)) {
					Collections.swap(list, i, j);
				}
			}

			for (int j=0; j<n; j++) {
				System.out.print((j==0?"":" ")+list.get(j));
			}
			System.out.println();
			
		}
		
	}
}
