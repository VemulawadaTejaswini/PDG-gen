import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String tmp = br.readLine();
			
			if(tmp == null){
				break;
			}
			
			char prev = '\0';
			int num = 0;
			for(int i = tmp.length() - 1; i >= 0; i--){
				char tmpChar = tmp.charAt(i);
				if(romanToNum(prev) > romanToNum(tmpChar)){
					num -= romanToNum(tmpChar);
				}
				else {
					num += romanToNum(tmpChar);
				}
				
				prev = tmpChar;
				
			}
			
			System.out.println(num);
		}
	}
	
	static int romanToNum(char c){
		if(c == 'I'){
			return 1;
		}
		else if(c == 'V'){
			return 5;
		}
		else if(c == 'X'){
			return 10;
		}
		else if(c == 'L'){
			return 50;
		}
		else if(c == 'C'){
			return 100;
		}
		else if(c == 'D'){
			return 500;
		}
		else if(c == 'M'){
			return 1000;
		}
		else {
			return 0;
		}
	}

}