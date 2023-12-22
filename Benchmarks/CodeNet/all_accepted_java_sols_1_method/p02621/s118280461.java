import java.io.*;

public class Main{
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main (String[] args) throws IOException{
        int a = Integer.parseInt(br.readLine());
        int ans = a + a*a + a*a*a;
        bw.write(ans + "");
		bw.flush();
	}
}
