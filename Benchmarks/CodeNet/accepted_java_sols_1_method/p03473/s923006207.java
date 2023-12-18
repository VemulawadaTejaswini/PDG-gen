import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Main {
	public static void main(String[] args){
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(System.out);) {
			int m = Integer.parseInt(br.readLine());
			pw.println(48 - m);
		} catch (Exception e) {
		}
	}
}