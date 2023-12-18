import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;


		while((str=br.readLine()) != null){
			int d = Integer.parseInt(str);
			int area=0;

			for(int i=0; i<600; i += d){
				area += (i*i*d);
			}

			System.out.println(area);

		}
	}

}