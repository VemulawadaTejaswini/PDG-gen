import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(char c : str.toCharArray()){
			if(Character.isUpperCase(c)){
				String s = String.valueOf(c);
				sb.append(s.toLowerCase());
			}else{
				String s = String.valueOf(c);
				sb.append(s.toUpperCase());
			}
		}
		System.out.println(sb.toString());
	}
}