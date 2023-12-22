import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		List<Integer> beki = new ArrayList<Integer>();
		beki.add(1);

		for(int i = 2;i<32;i++){
			int p = 2;
			int now = (int)Math.pow(i, p);
			while(now <= X){
				beki.add(now);
				p++;
				now = (int)Math.pow(i, p);

			}
		}

		beki.sort(null);
		System.out.println(beki.get(beki.size()-1));

	}


}