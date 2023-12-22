import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String str;
		
		while(sc.hasNextLine()){
			str = sc.nextLine();
			
			char[] c_str = str.toCharArray();
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