import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer time = Integer.parseInt(br.readLine());
		Integer hour = time / (60 * 60);
		Integer minute = (time - (hour * 60 * 60)) / 60;
		Integer ss = (time - (hour * 60 * 60)) % 60;
		System.out.println(hour + ":" + minute + ":" + ss);
	}

}