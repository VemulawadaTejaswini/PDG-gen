import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String[] spl = br.readLine().split(" ");
			System.out.println(spl[0].substring(0,1) + spl[1].substring(0,1) + spl[2].substring(0,1));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}