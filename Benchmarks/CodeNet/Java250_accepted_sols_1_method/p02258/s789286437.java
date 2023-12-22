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
		Long[] arr = new Long[list.size()];
		arr = list.toArray(arr);
		int cursor = arr.length - 2;
		long maxProfit = arr[cursor + 1] - arr[cursor];
		long a, b;
		long max = (a = arr[cursor + 1]) > (b = arr[cursor]) ? a : b;
		cursor--;
		while(cursor >= 0){
			if(max - arr[cursor] > maxProfit){
				maxProfit = max - arr[cursor];
			}
			if(arr[cursor] > max){
				max = arr[cursor];
			}
			cursor--;
		}
		System.out.println(maxProfit);
	}
}