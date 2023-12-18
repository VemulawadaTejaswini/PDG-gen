import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int n = in.nextInt();
			List<Integer> search = new ArrayList<Integer>();
			int count = 0;
			boolean button = false;
			for(int i=2; i<=n; i++) search.add(i);
			for(int i=0; i<search.size(); i++) {
				int tmp = search.get(0);
				count++;
				for(int j=search.size()-1; j>=0; j--) {
					if(search.get(j) % tmp == 0) {
						search.remove(j);
						button = true;
					}
				}
				if(button) {
					i--;
					button = false;
				}
			}
			System.out.println(count);
		}
	}
}