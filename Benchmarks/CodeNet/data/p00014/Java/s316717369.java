import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String tmp = br.readLine();
			
			if(tmp == null){
				break;
			}
			
			int d = Integer.parseInt(tmp);
			
			int result = 0;
			for(int i = 0; i < 600; i += d){
				result += d*i*i;
			}
			
			System.out.println(result);
		}
	}

}