import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = reader.readLine();
			int x = Integer.parseInt(line);
			int[] digit = new int[line.length()];
			int result = 0;
			if(x == 0){
				break;
			}else{
				for(int i = 0; i < line.length(); i++){
					digit[i] = Character.getNumericValue(line.charAt(i));
					result += digit[i];
				}
			}
			System.out.println(result);
		}
	}
}