import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Long> list = new ArrayList<Long>(); 
		br.readLine();
		String str;
		while((str = br.readLine()) != null){
			list.add(Long.valueOf(str));
		}
		int cursor = list.size() - 2;
		long maxProfit = list.get(cursor + 1) - list.get(cursor);
		long a, b;
		long max = (a = list.get(cursor + 1)) > (b = list.get(cursor)) ? a : b;
		cursor--;
		while(cursor >= 0){
			if(max - list.get(cursor) > maxProfit){
				maxProfit = max - list.get(cursor);
			}
			if(list.get(cursor) > max){
				max = list.get(cursor);
			}
			cursor--;
		}
		System.out.println(maxProfit);
	}
}