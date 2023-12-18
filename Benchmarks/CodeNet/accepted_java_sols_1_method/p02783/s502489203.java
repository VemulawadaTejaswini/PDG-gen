import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = br.readLine().split(" ");
		
		int h = Integer.parseInt(line[0]);
		int a = Integer.parseInt(line[1]);
		
		if(h%a!=0) {
			System.out.println(h/a+1);
		}else {
			System.out.println(h/a);
		}
		

		br.close();
	}
}
