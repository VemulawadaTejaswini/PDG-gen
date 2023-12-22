import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String result = "";
			for(int i=str.length()-1;i >= 0;i--){
				result += str.charAt(i);
			}
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}