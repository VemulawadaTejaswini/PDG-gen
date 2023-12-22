import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<>();
		
		while(sc.hasNext()) {
			n.add(sc.nextInt());
		}

		int i = 0;
		while(i < n.size()) {
			int cnt = 0;
			for(int a = 0; a < 10; a++) {
				for(int b = 0; b < 10; b++) {
					for(int c = 0; c < 10; c++) {
						for(int d = 0; d < 10; d++) {
							if(a + b + c + d == n.get(i)) {
								cnt++;
							}
						}
					}
				}
			}
			System.out.println(cnt);
			i++;
		}
	}
}