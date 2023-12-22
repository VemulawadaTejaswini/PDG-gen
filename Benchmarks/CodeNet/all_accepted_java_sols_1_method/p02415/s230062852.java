import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
	Character objChar1;
	
	String str;
	char c;
	int i,a;
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	str = br.readLine();
	
	

	for (i=0;i<str.length();i++){
		c=str.charAt(i);
		if(Character.isUpperCase(c)) {
			c=Character.toLowerCase(c);
		}else {
			c=Character.toUpperCase(c);
		}
		System.out.print(c);
		
	}
	System.out.println();
}
}