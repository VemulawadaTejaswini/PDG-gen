import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		int i=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			i=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println((int)(Math.pow(i, 3)));
	}

}