import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sec = Integer.parseInt(br.readLine());
		int h = sec / 3600;
		int m = (sec % 3600) / 60;
		int s = (sec % 3600) % 60;

		System.out.println(h + ":" + m + ":" + s);

	}
}