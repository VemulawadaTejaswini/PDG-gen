import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Thread Tree
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		Main main = new Main();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			Post[] posts = new Post[n + 1];
			posts[0] = main.new Post(0, "", -1);

			for (int i = 1; i <= n; i++) {
				int k = parseInt(br.readLine());
				String msg = br.readLine();
				posts[i] = main.new Post(i, msg, posts[k].depth + 1);
				posts[k].children.add(posts[i]);
			}

			System.out.println(posts[1].toString());

		} //end while
	} //end main

	class Post {
		Post parent;
		int id;
		String msg;
		int depth;
		List<Post> children;

		Post(int id, String msg, int depth) {
			this.id = id;
			this.msg = msg;
			this.depth = depth;
			children = new ArrayList<>();
		}

		public String toString() {
			StringBuilder ret = new StringBuilder();
			for (int i = 0; i < depth; i++) {
				ret.append('.');
			}
			ret.append(msg).append('\n');
			for (Post c : children) {
				ret.append(c.toString());
			}
			return ret.toString();
		}
	}
}