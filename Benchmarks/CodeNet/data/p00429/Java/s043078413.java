import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			int n = Integer.parseInt(br.readLine());
			
			if( n == 0){
				break;
			}
			
			String str = br.readLine();
			
			for(int i = 0; i < n; i++){
				str = translate(str);
			}
			
			System.out.println(str);
		}
	}
	
	static String translate(String str){
		char current = '\0';
		int count = 0;
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i <= str.length() ; i++){
			if(i == str.length()) {
				if(current != '\0'){
					sb.append(count);
					sb.append(current);
				}
				break;
			}
			char c = str.charAt(i);
			
			if(c != current) {
				if(current != '\0'){
					sb.append(count);
					sb.append(current);
				}
				count = 1;
				current = c;
			}
			else if(c == current){
				count++;
			}
			
			//System.out.println("count "+count+" current "+current);
		}
		
		return sb.toString();
	}

}