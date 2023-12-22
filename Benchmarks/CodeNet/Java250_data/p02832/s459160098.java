import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strArray = br.readLine().split(" ");
		int count = 0;
		int currentNum= 1;
		for(int i = 0; i < n ; i++) {
			int a = Integer.parseInt(strArray[i]);
			if(a ==currentNum) {
				count++;
				currentNum++;
			}
		}
		if(currentNum == 1) {
			System.out.println(-1);
		}else {
			System.out.println(n-count);

		}
	}
}
