import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			int time = Integer.parseInt(str);
			if ((time >= 0) && (time < 864000)) {
				int h = time / 3600;
				int m = (time % 3600) / 60;
				int s = (time % 3600) % 60;
             System.out.println(h + ":" + m + ":" + s);
			}
			//System.out.println(h + ":" + m + ":" + s);
		} catch (Exception e) {
			System.out.println("??¨??????"); 
		}
	}
}
			 