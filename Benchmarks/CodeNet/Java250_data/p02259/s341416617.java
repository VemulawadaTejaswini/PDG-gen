import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i=0; i<n; i++) list.add(sc.nextInt());
		
		
		int count = 0;
		for (int i=0; i<n-1; i++) {
			
			for (int j=0; j<n-i-1; j++) {
				if (list.get(j) > list.get(j+1)) {
					Collections.swap(list, j, j+1);
					count++;
				}
			}
			
		}
		
		for (int i=0; i<n; i++) {
			System.out.print((i==0?"":" ")+list.get(i));
		}
		System.out.println();
		System.out.println(count);
		
	}
}
