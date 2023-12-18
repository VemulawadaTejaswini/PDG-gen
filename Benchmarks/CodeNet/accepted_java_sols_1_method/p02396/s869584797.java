import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> inputList = new ArrayList<Integer>();
		while(true) {
			if (inputList.size() > 10000) {
				break;
			}
					
			int num = Integer.parseInt(br.readLine());
			
			if (num == 0) {
				break;
			}
			
			if (!(num >= 1 && num <= 10000)) {
				throw new IllegalArgumentException();
			}
				
			inputList.add(num);
		}
		
		for (int i = 0; i < inputList.size(); i++) {
			System.out.println("Case " + (i + 1) + ": " + inputList.get(i));
		}
	}
}