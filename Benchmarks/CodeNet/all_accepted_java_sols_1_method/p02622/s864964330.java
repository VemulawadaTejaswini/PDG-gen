import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String t = br.readLine();
		
		char[] chs = s.toCharArray();
		char[] cht = t.toCharArray(); 
		int cnt = 0;
		for(int i=0; i<s.length(); i++) {
			if(chs[i] != cht[i])
				cnt++;
		}
		
		bw.write(cnt + "\n");
		bw.flush();
	}

}
