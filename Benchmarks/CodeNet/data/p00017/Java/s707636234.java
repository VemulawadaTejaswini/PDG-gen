import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		while((str = br.readLine()) != null){
			
			char[] c_str = new char[80];
			str.getChars(0, str.length(), c_str, 0);
			for(int j = 0;j < 26;j++){
				for(int pos = 0,max = c_str.length;pos < max;pos++){
					if(c_str[pos] >= 'a' && c_str[pos] <= 'z'){
						c_str[pos]++;
						if(c_str[pos] > 'z'){ c_str[pos] = 'a';}
					}
				}
				
				String newstr = new String(c_str);
				
				if(newstr.indexOf("the") != -1 || newstr.indexOf("this") != -1 || newstr.indexOf("that") != -1){
					break;
				}
			}
			
			System.out.println(c_str);
			
		}
		
	}
}