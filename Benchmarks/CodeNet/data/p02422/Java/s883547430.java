import java.io.*;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		int q = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < q; i++){
			String[] s = br.readLine().split(" ");
			
			if(s[0].equals("replace")){
				sb.replace(Integer.parseInt(s[1]), Integer.parseInt(s[2]) + 1, s[3]);
			}
			else if(s[0].equals("reverse")){
				StringBuilder re = new StringBuilder(sb.substring(Integer.parseInt(s[1]), Integer.parseInt(s[2]) + 1));
				String reverse = new String(re.reverse());
				sb.replace(Integer.parseInt(s[1]), Integer.parseInt(s[2]) + 1, reverse);
			}
			else if(s[0].equals("print")){
				String print = sb.substring(Integer.parseInt(s[1]), Integer.parseInt(s[2]) + 1);
				System.out.println(print);
			}
		}
	}
}