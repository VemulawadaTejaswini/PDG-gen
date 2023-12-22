import java.io.*;

public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		String watchStr = input.readLine();
		
		int watch = Integer.parseInt(watchStr);
		
		int hour = 3600;
		
		int minute = 60;
		
		System.out.println(watch / hour + ":" + (watch % hour) / minute + ":" + ((watch % hour) % minute));
	}
}

