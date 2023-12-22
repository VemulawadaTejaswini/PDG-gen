import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int S=Integer.parseInt(str);
		int S1=(S-((int)S/3600)*3600)/60;
		System.out.println(S/3600+":"+S1+":"+S%60);
	}
}