import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) {
		String[] S = new String[2];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();

		try {
			int n = Integer.parseInt(br.readLine());

			Deque<String> list = new ArrayDeque<String>();

			for (int i = 0; i < n; i++) {
				S = br.readLine().split(" ");
				if ("insert".equals(S[0]))
					list.addFirst(S[1]);
				if ("delete".equals(S[0]))
					list.remove(S[1]);
				if ("deleteFirst".equals(S[0]))
					list.removeFirst();
				if ("deleteLast".equals(S[0]))
					list.removeLast();
			}

			if (!list.isEmpty()) {
				ans.append(list.getFirst());
				list.removeFirst();
			}
			while (!list.isEmpty()) {
				ans.append(" ").append(list.getFirst());
				list.removeFirst();
			}

			System.out.println(ans.toString());

			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

