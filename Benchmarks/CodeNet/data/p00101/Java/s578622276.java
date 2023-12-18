import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();		
		for(int i = 0 ; i < Integer.parseInt(n) ; i++){
			String a = br.readLine();
			System.out.println(a.replaceAll("Hoshino","Hoshina"));
		}
	}

}