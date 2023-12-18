import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_3_B {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		while(true){
			int testCase = Integer.parseInt(br.readLine());
			if(testCase==0){
				break;
			}
			int i=1;
			System.out.println("Case "+i+": "+testCase);
			i++;
		}


	}
}