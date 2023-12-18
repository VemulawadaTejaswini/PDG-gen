
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		List<Integer> A = new ArrayList<Integer>();
		String[] get = br.readLine().split(" ");
		for(int i = 0;i<N;i++){
			A.add(Integer.parseInt(get[i]));
		}

		A.sort(null);

		int count = 0;
		int now=0,prev=A.get(0);

		int remove = 0;

		for(int i = 0;i<A.size();i++){
			now =A.get(i);
			if(now == prev){
				count++;
			}else{
				if(prev > count)remove += (count);
				else if(count > prev)remove += (count-prev);
				count = 1;
			}
			prev = now;
		}
		if(prev > count)remove += count;
		else if(count > prev)remove += (count-prev);
		System.out.println(remove);
	}
}
