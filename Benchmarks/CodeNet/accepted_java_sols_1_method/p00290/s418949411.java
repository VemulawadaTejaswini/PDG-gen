import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str;
        while((str=br.readLine())!=null){
        String[] sp = str.split(" ");

        int a = Integer.parseInt(sp[0]);
        int b = Integer.parseInt(sp[1]);

        System.out.println(a * b);

        }
	}

}