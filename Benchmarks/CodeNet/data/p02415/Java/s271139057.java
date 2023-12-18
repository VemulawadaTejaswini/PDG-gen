import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Pattern p = Pattern.compile("[A-Z]");

		String str = br.readLine();
		char[] upper = str.toUpperCase().toCharArray();
		char[] origin = str.toCharArray();
		for(int i=0; i<origin.length;i++){
			if(origin[i]==upper[i]){
				if(p.matcher(String.valueOf(origin[i])).find()){
					upper[i] = String.valueOf(origin[i]).toLowerCase().charAt(0);
				}
			}
		}

		System.out.println(String.valueOf(upper));
	}
}