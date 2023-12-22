
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		while(true){
			i++;
			int k = Integer.parseInt(br.readLine());
			if(k == 0){break;}
			System.out.println("Case "+i+": "+k);
		}
	}

}