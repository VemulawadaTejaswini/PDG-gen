import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String[] inputNum = br.readLine().split(" ");
		List<Integer> numArray = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			numArray.add(Integer.parseInt(inputNum[i]));
		}
		Collections.reverse(numArray);
		for (int i = 0; i < numArray.size(); i++) {
			if (i == numArray.size()-1) {
				System.out.println(numArray.get(i));
			}else {
				System.out.print(numArray.get(i) + " ");
			}
		}
	}

}