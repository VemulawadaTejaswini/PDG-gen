import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int x = Integer.parseInt(br.readLine());

			int hour = x/3600;
			int min = (x-(hour*3600))/60;
			int sec = x-(min*60)-(hour*3600);
			System.out.println((hour)+":"+(min)+":"+(sec));


		}  catch (IOException e) {
			e.printStackTrace();
		}



	}

}