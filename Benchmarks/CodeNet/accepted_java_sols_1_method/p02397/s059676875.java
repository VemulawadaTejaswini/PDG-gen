import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {

		    String str = br.readLine();
		    StringTokenizer st = new StringTokenizer(str, " ");
			int a  = Integer.parseInt(st.nextToken());
			int b  = Integer.parseInt(st.nextToken());

			if(a == 0 && b == 0){
				break;
			}else if (a < b) {
				System.out.println(a + " " +  b);
			}else {
				System.out.println(b + " " +  a);
			}
		}
	}
}