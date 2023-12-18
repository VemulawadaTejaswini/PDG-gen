import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int r = Integer.parseInt(str);
		double s, l;

		s = r*r*3.141592;
		l = 2*r*3.141592;

		System.out.printf("%.6f %.6f\n", s, l);
	}
}