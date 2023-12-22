import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] get = br.readLine().split(" ");

		int N = Integer.parseInt(get[0]);
		int K = Integer.parseInt(get[1]);

		List<Integer> A = new ArrayList<Integer>();
		get = br.readLine().split(" ");
		for(int i = 0;i<N;i++){
			A.add(Integer.parseInt(get[i]));
		}

		A.sort(null);

		List<Integer> countList = new ArrayList<Integer>();

		int now;
		int prev = A.get(0);
		int count = 0;
		for(int i = 0;i<N;i++){
			now = A.get(i);
			if(prev == now){
				count++;
			}else{
				countList.add(count);
				count = 1;
			}
			prev = now;
		}

		countList.add(count);

		countList.sort(null);

		int reWrite = 0;

		for(int i = 0;i<countList.size()-K;i++)reWrite += countList.get(i);

		System.out.println(reWrite);
	}
}