import java.io.*;
import java.util.*;

public class Main {
	static public void main(String[] argv) {
		try{
//			FileWriter fw = new FileWriter("output.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			PrintWriter pw = new PrintWriter(bw, true);
			
//			FileReader fr = new FileReader("input.txt");
//			BufferedReader br = new BufferedReader( fr );
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			PrintWriter pw = new PrintWriter(bw, true);
			
			while(true) {
				String buf = br.readLine();
				StringTokenizer st = new StringTokenizer(buf);
				int n;
				n = Integer.valueOf(st.nextToken());
				if(n == 0) break;
				
				String str = br.readLine();
				for(int i = 0; i < n; i++) {
//					System.out.println(str);
					str = operate(str);
				}
				pw.println(str);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static String operate(String str) {
		String ret = new String();
		StringBuffer sb;
		char prev = '0';
		int count = 1;
		for(int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			if(i == 0) {
				prev = curr;
				continue;
			}
			
			if( prev == curr ) {
				count++;
			} else {
				sb = new StringBuffer();
				sb.append(ret);
				sb.append(count);
				sb.append(prev);
				ret = sb.toString();
				count = 1;
				prev = curr;
			}
		}
		
		sb = new StringBuffer();
		sb.append(ret);
		sb.append(count);
		sb.append(prev);
		ret = sb.toString();
		count = 1;
		
		return ret;
	}
}