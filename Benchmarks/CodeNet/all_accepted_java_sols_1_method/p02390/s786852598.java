import java.io.*;


public class Main{
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int time, hour, minute, sec;

		time = Integer.parseInt(br.readLine());
		minute = (time % (60 * 60)) / 60;
		hour = time / (60 * 60);
		sec = (time % (60 * 60)) % 60;

		System.out.println(hour + ":" + minute + ":" + sec);

	}
}