import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t[];
		int count = 0;
		boolean flag=true;
		try {
			String w = br.readLine();
			while(flag){
				t = br.readLine().split(" ");
				for (String string : t) {
					if(string.equals("END_OF_TEXT")){
						flag = false;
						break;
					}
					if(string.equalsIgnoreCase(w)){
						count++;
					}
				}
			}
			System.out.println(count);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}