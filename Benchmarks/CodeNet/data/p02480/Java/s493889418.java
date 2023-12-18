import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		int rec;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		rec = Integer.parseInt(br.readLine());
		System.out.println(rec*rec*rec);
	}
}