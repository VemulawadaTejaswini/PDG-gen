import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = reader.readLine();
			int[] digit = new int[line.length()];
			int result = 0;
			for(int i = 0; i < line.length(); i++){
				digit[i] = Character.getNumericValue(line.charAt(i));
				result += digit[i];
			}
			if(result == 0){
				break;
			}else{
				System.out.println(result);
			}
		}
	}
}