import java.io.*;

public class Main{
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main (String[] args) throws IOException{
        String s = br.readLine();
        String t = br.readLine();
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(i))    ans++;
        }
        bw.write(ans + "");
		bw.flush();
	}
}
