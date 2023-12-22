import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		
		int ones = 0;
		for(int i = 0; i < str.length() ; i++){
			if(str.charAt(i) == '1'){
				ones++;;
			}
		}
		
		System.out.println(ones);
	}

}
