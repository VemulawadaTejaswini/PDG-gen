
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

	public void doIt() throws IOException{
		BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = din.readLine()) != null){
			System.out.println(s.toUpperCase());
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		try {
			obj.doIt();
		} catch (IOException e) {

		}

	}

}