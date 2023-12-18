import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		List<Integer> list = new ArrayList<Integer>();
		
		end: {
			while (true) {
				String str = br.readLine();
				switch (str.substring(0, 2)) {

				case "in":
					// insert????????????
					int insert = Integer.parseInt((String) str.subSequence(7, str.length()));
					deque.add(insert);
					list.add(insert);
					break;

				case "ex":
					// extract????????????
					Collections.sort(list);
					sb.append(list.get(list.size()-1) + "\n");
					list.remove(list.size()-1);
					break;
					
				case "en":
					//end??\??????????????????
					break end;
				}
			}
		}
		System.out.print(sb.toString());
	}
}