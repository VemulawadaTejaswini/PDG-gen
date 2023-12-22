import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		List<Integer> list = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader br = new BufferedReader(new FileReader("in1.txt"));
		// BufferedReader br = new BufferedReader(new FileReader("in2.txt"));
		int N = Integer.parseInt(br.readLine());
		String[] s_in = br.readLine().split(" ");
		for (int i = 0; i < N; i++)
			list.add(Integer.parseInt(s_in[i]));
		
		int cnt_swap = 0;
		for (int i = 0; i < N; i++) {
			// list[0..i-1]??????????????????
			for (int j = N - 1; j > 0; j--) {
				if (list.get(j) < list.get(j - 1)) {
					int tmp = list.get(j - 1);
					list.set(j - 1, list.get(j));
					list.set(j, tmp);
					cnt_swap++;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int n : list) {
			sb.append(n);
			sb.append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append('\n');
		sb.append(cnt_swap);
		System.out.println(sb.toString());
	}
	
}