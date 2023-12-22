import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		String changeLine = "";
		for(int i = 0;i<line.length();i++){
			if(Character.isUpperCase(line.charAt(i))){
				changeLine += String.valueOf(Character.toLowerCase(line.charAt(i)));
			}
			else if(Character.isLowerCase(line.charAt(i))){
				changeLine += String.valueOf(Character.toUpperCase(line.charAt(i)));
			}
			else{
				changeLine += String.valueOf(line.charAt(i));
			}
		}
		
		System.out.println(changeLine);
	}

}