import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int i = 1;
		int x;

		while((x = Integer.parseInt(s = br.readLine())) != 0){
			System.out.println("Case " + i + ": " + x);
			i++;
		}
	}
}