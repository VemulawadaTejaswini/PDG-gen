import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ", n);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    list.add(Integer.parseInt(line[i]));
		}
		ArrayList<Integer> ans = new ArrayList<>();
		while (list.size() > 0) {
		    for (int i = list.size() - 1; i >= 0; i--) {
		        if (list.get(i) > i + 1) {
		            System.out.println(-1);
		            return;
		        }
		        if (list.get(i) == i + 1) {
		            list.remove(i);
		            ans.add(i + 1);
		            break;
		        }
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = ans.size() - 1; i >= 0; i--) {
		    sb.append(ans.get(i)).append("\n");
		}
		System.out.print(sb);
    }
}

