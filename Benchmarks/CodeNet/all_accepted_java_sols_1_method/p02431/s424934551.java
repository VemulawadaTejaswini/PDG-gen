import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			int mode = sc.nextInt();
			if (mode == 0) {
				list.add(sc.nextInt());
			}
			else if (mode == 1) {
				System.out.println(list.get(sc.nextInt()));
			}
			else if (mode == 2) {
				list.remove(list.size()-1);
			}
		}
		
	}
}

