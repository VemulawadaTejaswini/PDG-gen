import java.io.*;

class Main {
	public static void main(String args[]) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		
		//System.out.println("????????\???");
		String str = br.readLine();
		
		//System.out.println("??\?????????" +str);
		int mil = Integer.parseInt(str);
		
		int hour = mil / 3600;
		int minutes = (mil / 60) % 60;
		int seconds = mil % 60;
		
		System.out.println("hh:mm:ss : " + hour + ":" + minutes + ":" + seconds);
	}
}