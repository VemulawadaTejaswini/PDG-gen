import java.io.IOException;
import java.util.*;

/**
 */
class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		while(in.hasNext()) {
			List<Integer> ai = new ArrayList<Integer>();
			List<Integer> bi = new ArrayList<Integer>();

			for(int i=0;i<4;i++) ai.add(in.nextInt());
			for(int i=0;i<4;i++) bi.add(in.nextInt());

			Map<Integer, Integer> hit = new HashMap<Integer, Integer>();
			for(int i=0;i<4;i++) {
				if(ai.get(i) == bi.get(i)) {
					hit.put(ai.get(i), 1);
				}
			}

			int blow = 0;
			for(int i=0;i<4;i++) {
				if(hit.containsKey(bi.get(i)) == false && ai.contains(bi.get(i))) {
					blow++;
				}
			}
			System.out.println(String.format("%d %d",hit.size(),blow));
		}
	}
}