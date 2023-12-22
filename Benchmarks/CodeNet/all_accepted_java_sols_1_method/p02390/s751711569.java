import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args)throws Exception {

		int num , h , m , s ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("");
		num = Integer.parseInt(br.readLine());

		h = num / 3600;
		m = (num % 3600) / 60;
		s = (num % 3600) % 60;

		System.out.println(h + ":" + m + ":" + s);



	}

}