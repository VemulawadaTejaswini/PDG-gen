import java.util.*;

class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();

		ArrayList<Integer> array = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			int query = scan.nextInt();
			if (query == 0) {
				array.add(scan.nextInt());
			}
			else if (query == 1) {
				System.out.println(array.get(scan.nextInt()));
			}
			else if (query == 2) {
				array.remove(array.size()-1);
			}
		}
		
	}
}
