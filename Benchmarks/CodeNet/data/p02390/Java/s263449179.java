import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();

	int x = Integer.parseInt(str);
        int h, m, s;

        h = x / 3600;
        m = x % 3600 / 60;
        s = x % 60;

        System.out.println(h + ":" + m +":" + s);
	}
}