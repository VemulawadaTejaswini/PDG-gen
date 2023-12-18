import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void Main(String[] args) throws IOException {
		InputStreamReader br = new InputStreamReader(System.in);
        BufferedReader is = new BufferedReader(br);
        String str = is.readLine();
        int a = Integer.parseInt(str);
        
        a=a*a*a;
        
        System.out.println(a);
	}
}