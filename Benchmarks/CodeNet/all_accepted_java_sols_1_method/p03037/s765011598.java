import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int N = Integer.parseInt(tmp[0]);
		int M = Integer.parseInt(tmp[1]);

		List<Integer> L = new ArrayList<Integer>();
		List<Integer> R = new ArrayList<Integer>();

		for(int i = 0;i<M;i++){
			tmp = br.readLine().split(" ");
			L.add(Integer.parseInt(tmp[0]));
			R.add(Integer.parseInt(tmp[1]));
		}

		L.sort(null);
		R.sort(null);
		int max = R.get(0);
		int min = L.get(L.size()-1);

		if(max-min+1<0){
			System.out.println(0);
		}else{
			System.out.println(max-min + 1);
		}



	}
}
