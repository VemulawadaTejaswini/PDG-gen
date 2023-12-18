import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line = input.readLine();
		
		for(int i = 0 ; i < line.length() ; i++ ){
			if(Character.isUpperCase(line.charAt(i))) sb.append(Character.toLowerCase(line.charAt(i)));
			else if(Character.isLowerCase(line.charAt(i))) sb.append(Character.toUpperCase(line.charAt(i)));
			else sb.append(line.charAt(i));
		}
		
		System.out.println(sb);
	}
}