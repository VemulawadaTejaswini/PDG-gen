import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main
{
	public static void main(String[] args){
		java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));
		String line;
		StringTokenizer st;
		try{
			while(true){
				line = br.readLine();
				st = new StringTokenizer(line);
				int s = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
				System.out.println((int)Math.log10(s) + 1);
				if(line == null){
					break;
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}