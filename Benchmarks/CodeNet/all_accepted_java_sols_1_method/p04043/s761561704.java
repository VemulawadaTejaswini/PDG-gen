import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) throws Exception {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String[] inputStringList = br.readLine().split("\\s+");

			List<String> fiveList = new ArrayList<>();
			List<String> sevenList = new ArrayList<>();

			for (String inputString : inputStringList) {
				if (inputString.equals("5")) {
					fiveList.add(inputString);
				} else if (inputString.equals("7")) {
					sevenList.add(inputString);
				}
			}
			
			String result;
			if (fiveList.size() == 2 && sevenList.size() == 1) {
				result = "YES";
			} else {
				result = "NO";
			}
			
			System.out.println(result);
			
		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

	}
}