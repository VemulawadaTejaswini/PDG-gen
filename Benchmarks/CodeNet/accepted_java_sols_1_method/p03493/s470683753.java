import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    String s = br.readLine();
	    int b = s.length() - s.replaceAll("1","").length();
	    System.out.println(b);
	} catch(IOException e) {
	    e.printStackTrace();
	}
    }
}