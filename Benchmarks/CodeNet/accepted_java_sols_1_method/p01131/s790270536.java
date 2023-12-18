import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static String[] character = {"",".,!? ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int k = 0; k < n; k++){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			int prevI = 0;
			int prevJ = -1;
			for(int i = 0; i < str.length() ; i++){
				char c = str.charAt(i);
				
				if(c >= '1' && c <= '9'){
					prevI = c - '0';
					prevJ++;
					prevJ %= character[prevI].length();
				}
				else if(prevI != 0){
					System.out.print(character[prevI].charAt(prevJ));
					prevI = 0;
					prevJ = -1;
				}
			}
			System.out.println();
		}
		
	}

}