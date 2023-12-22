import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int i =1;
		while(true){
			int x = Integer.parseInt(br.readLine());
			if (x==0) {
				break;
			}
			sb.append("Case ").append(Integer.toString(i++)).append(": ").append(Integer.toString(x)).append("\n");
		}
		System.out.print(sb);
	}
}