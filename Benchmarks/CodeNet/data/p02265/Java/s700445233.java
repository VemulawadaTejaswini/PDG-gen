import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		LinkedList<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			String str = br.readLine();

			if (str.startsWith("insert")) {
				list.addFirst(Integer.parseInt(str.substring(str.indexOf(" ") + 1)));
			} else if (str.equals("deleteFirst")) {
				list.pollFirst();
			} else if (str.equals("deleteLast")) {
				list.pollLast();
			} else {
				list.remove((Integer) Integer.parseInt(str.substring(str
						.indexOf(" ") + 1)));
			}
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		sb.append(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			sb.append(" ");
			sb.append(list.get(i));
		}
		sb.append("\n");
        bw.write(sb.toString());

        bw.close();
		br.close();
	}
}

