import java.io.*;

class Main{

    public static void main(String[] args)throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String strInput = br.readLine();
	String[] input = strInput.split(" ");
	int a = Integer.parseInt(input[0]);
	int b = Integer.parseInt(input[1]);

	int d = a / b;
	int r = a % b;
	double f = (double) a / b;

	String rd = String.valueOf(d);
	String rr = String.valueOf(r);
	String rf = String.valueOf(f);

	System.out.printf("%d %d %f\n", d, r, f);

    }

}