import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] cut = input.split(" ");
		int a = Integer.parseInt(cut[0]);
		int b = Integer.parseInt(cut[1]);
		
		int d =a/b;
		int r = a%b;
		double f =(double)a/(double)b;
		
		String g = String.format("%.5f",f);
		System.out.println(d+" "+r+" "+g);
	}
}