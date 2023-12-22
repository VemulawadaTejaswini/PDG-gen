
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int b = 0;
		int c = 0;

		int su = Integer.parseInt(br.readLine());
		if((su > 0) && (86400 > su)){

			if(su >= 60){
				c = su / 60;
				su %= 60;
			}
			if(c >= 60){
				b = c / 60;
				c = c % 60;
			}
		}

		System.out.println(b+":"+c + ":" + su);
	}
}