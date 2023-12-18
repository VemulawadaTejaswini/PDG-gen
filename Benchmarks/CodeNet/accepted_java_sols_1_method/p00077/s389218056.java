import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			char[] charArray = str.toCharArray();
			
			for(int i = 0; i < charArray.length ; i++){
				if(charArray[i] == '@'){
					for(int j = 0; j < charArray[i + 1] - '0' ; j++){
						System.out.print(charArray[i + 2]);
					}
					i += 2;
				}
				
				else {
					System.out.print(charArray[i]);
				}
			}
			System.out.println();
		}
	}

}