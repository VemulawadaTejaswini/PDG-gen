import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		List<Integer> t = new ArrayList<Integer>(0);
		List<Integer> x = new ArrayList<Integer>(0);
		List<Integer> y = new ArrayList<Integer>(0);

		t.add(0);
		x.add(0);
		y.add(0);

		for(int n = 0;n<N;n++){
			String[] str = br.readLine().split(" ");
			t.add(Integer.parseInt(str[0]));
			x.add(Integer.parseInt(str[1]));
			y.add(Integer.parseInt(str[2]));
		}

		for(int i = 1;i<=N;i++){
			int dis = Math.abs(x.get(i)-x.get(i-1)) + Math.abs(y.get(i) - y.get(i-1));
			int time = t.get(i) - t.get(i-1);
			if(time < dis){
				System.out.println("No");
				System.exit(0);
			}

			if(time%2 != dis%2){
				System.out.println("No");
				System.exit(0);
			}

		}
		System.out.println("Yes");

	}
}