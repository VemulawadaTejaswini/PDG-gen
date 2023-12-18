import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String now = "A";
		while((str=br.readLine())!=null){
			String[] c = str.split(",");
			if(now.equals(c[0]))
				now=c[1];
			else if(now.equals(c[1]))
					now=c[0];
		}
		System.out.println(now);
	}
}