import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader br = new BufferedReader(new FileReader("in1.txt"));
		// BufferedReader br = new BufferedReader(new FileReader("in2.txt"));
		int n = Integer.parseInt(br.readLine());
		List<Integer> S = new ArrayList<Integer>();
		String[] line_S = br.readLine().split(" ");
		for (String str : line_S)
			S.add(Integer.parseInt(str));
		int q = Integer.parseInt(br.readLine());
		List<Integer> T = new ArrayList<Integer>();
		String[] line_T = br.readLine().split(" ");
		for (String str : line_T)
			T.add(Integer.parseInt(str));
		
		int C = 0;
		for (int t : T)
			for (int s : S)
				if (s == t) {
					C++;
					break;
				}
		
		System.out.println(C);
	}
}