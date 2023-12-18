import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		int taroPoint = 0;
		int hanakoPoint = 0;
		for (int i = 0; i < cnt; i++) {
			String line = br.readLine();
			String[] arr = line.split(" ");
			String taroHand = arr[0];
			String hanakoHand = arr[1];
			
			if (taroHand.compareTo(hanakoHand) > 0) {
				taroPoint += 3;
			}
			else if (taroHand.compareTo(hanakoHand) < 0) {
				hanakoPoint += 3;
			} else {
				taroPoint++;
				hanakoPoint++;
			}
		}
		System.out.println(taroPoint + " " + hanakoPoint);

		if (br != null) {
			br.close();
			br = null;
		}
	}
}