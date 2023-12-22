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
		String str=br.readLine();
		str = str.replace(',', ' ');
		str = str.replace('.', ' ');
		String[] s = str.split(" ");
		boolean first = true;
		for(int i = 0; i < s.length; i++){
			if(s[i].length() >= 3 && s[i].length() <= 6){
				if(!first){
					System.out.print(" ");
				}
				System.out.print(s[i]);
				
				first=false;
			}
		}
		System.out.println();
	}

}