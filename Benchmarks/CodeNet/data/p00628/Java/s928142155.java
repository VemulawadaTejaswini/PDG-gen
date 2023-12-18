import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str = br.readLine();
			if(str.equals("END OF INPUT")){
				break;
			}
			String[] s = str.split(" " );
			for(int i = 0; i < s.length;i++){
				System.out.print(s[i].length());
			}
			System.out.println();
		}

	}

}