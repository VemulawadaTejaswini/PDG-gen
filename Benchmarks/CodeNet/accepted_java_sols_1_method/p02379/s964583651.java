import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] a=br.readLine().split(" ");
        double x1=Double.parseDouble(a[0]);
        double y1=Double.parseDouble(a[1]);
        double x2=Double.parseDouble(a[2]);
        double y2=Double.parseDouble(a[3]);
        System.out.printf("%.8f", Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)));
	}
}