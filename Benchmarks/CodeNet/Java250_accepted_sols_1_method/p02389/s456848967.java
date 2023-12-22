import java.io.*;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] menseki = line.split(" ");
		int sum = Integer.parseInt(menseki[0]) * Integer.parseInt(menseki[1]);
		int syu1 = Integer.parseInt(menseki[0]) * 2;
		int syu2 = Integer.parseInt(menseki[1]) * 2;
		int syuLength = syu1 + syu2;
		System.out.println(sum+" "+syuLength);
	}
}