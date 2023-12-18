import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str;
		if((str=br.readLine())!=null){

			if(str.equals("1 0 0") || str.equals("0 1 0") || str.equals("0 0 0")){
				System.out.println("Close");
			} else{
				System.out.println("Open");
			}
		}
	}
}