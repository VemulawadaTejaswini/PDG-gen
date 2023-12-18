import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = "";
		for(int i = 1; !(str.equals("0")); i++){
			str = br.readLine();
			sb.append("Case " + i + ": " + str + "\n");
		}//for
		System.out.println(sb);
		br.close();
	}
}