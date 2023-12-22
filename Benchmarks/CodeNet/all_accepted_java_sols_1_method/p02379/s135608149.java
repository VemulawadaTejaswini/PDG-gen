import java.io.*;

class Main {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] div = br.readLine().split(" ");
		double x1 = Double.parseDouble(div[0]);
		double y1 = Double.parseDouble(div[1]);
		double x2 = Double.parseDouble(div[2]);
		double y2 = Double.parseDouble(div[3]);

		System.out.println(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));
	}
}