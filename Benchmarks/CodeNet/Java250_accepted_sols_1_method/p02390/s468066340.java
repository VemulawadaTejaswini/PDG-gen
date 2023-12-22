import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String secStr = br.readLine();
		int sec = Integer.parseInt(secStr);
		int[] hms = {0,0,0};
		for( int i = 0; i < 3 ; i++ ) {
			hms[i] = sec % 60;
			sec = sec / 60;
		}
		System.out.println(hms[2] + ":" + hms[1] + ":" + hms[0]);
	}
}