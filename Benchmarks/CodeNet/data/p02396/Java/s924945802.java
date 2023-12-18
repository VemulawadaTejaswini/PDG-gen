import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = "";
		int i = 1;
		while(true){
			str = br.readLine();
			if(str.equals("0")){
				break;
			}//if
			sb.append("Case " + i + ": " + str + "\n");
			i++;
		}//while
		System.out.println(sb);
		br.close();
	}
}