import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sumA = 0;
		int sumB = 0;
		
		String[] strArray = br.readLine().split(" ");
		
		for(int i = 0; i < 4; i++){
			sumA += Integer.parseInt(strArray[i]);
		}
		strArray = br.readLine().split(" ");
		
		for(int i = 0; i < 4; i++){
			sumB += Integer.parseInt(strArray[i]);
		}
		
		System.out.println(Math.max(sumA, sumB));
	
	}

}