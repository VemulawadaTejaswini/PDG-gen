import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Taro's Obsession
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int m = Integer.parseInt(line);
			int n = Integer.parseInt(br.readLine());

			//suspect
			Suspect[] suspects = new Suspect[m + 1];
			for (int i = 1; i < m + 1; i++) {
				suspects[i] = new Suspect(i);
			}

			//testimony
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				int f = Integer.parseInt(line.substring(0, line.indexOf(' ')));
				int l = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
				suspects[f].laters.offer(suspects[l]);
				suspects[l].formers.offer(suspects[f]);
			}

			//solve
			for (Suspect s : suspects) {
				if (s != null && !s.done && s.formers.size() == 0) {
					Deque<Suspect> queue = new ArrayDeque<Suspect>();
					queue.offer(s);
					while (queue.size() > 0) {
						Suspect f = queue.poll();
						for (Suspect l : f.laters) {
							l.formers.remove(f);
							if (l.formers.size() == 0) {
								queue.offer(l);
							}
						}
						//
						f.done = true;
						System.out.println(f.id);
					}
				}
			}
		} // end while

	} // end main
}

class Suspect {
	Deque<Suspect> formers = new ArrayDeque<Suspect>();
	Deque<Suspect> laters = new ArrayDeque<Suspect>();
	int id;
	boolean done = false;

	Suspect(int id) {
		this.id = id;
	}
}