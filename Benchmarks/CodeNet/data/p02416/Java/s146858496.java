import java.io.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String input = br.readLine();
			if(input == "0"){
				break;
			}
			Integer result = 0;
			for(int i = 0; i < input.length(); i++){
				result += Character.getNumericValue(input.charAt(i));
			}
			System.out.println(result);
		}
	}
}