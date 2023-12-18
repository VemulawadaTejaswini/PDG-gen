import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.valueOf(br.readLine());
		String[] A = br.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i, count = 0;
		for(i=0;i<N;i++) list.add(Integer.valueOf(A[i]));
		loop:
		while(true) {
			for(i=0;i<list.size();i++) {
				if(list.get(i) % 2 != 0) break loop;
				list.set(i, (list.get(i) / 2));
			}
			count++;
		}
		System.out.println(count);
	}
}