
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ;i < n;i++){
			list.add(Integer.parseInt(br.readLine()));
		}
		br.readLine();

		Collections.sort(list);
		int sum = 0;
		int result = 0;
		for(int i = 0 ; i < n-1 ;i++){
			sum += list.get(i);
			result += sum;
		}
		System.out.println(result);
	}

}