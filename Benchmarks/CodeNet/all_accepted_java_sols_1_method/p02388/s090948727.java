import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{

	int x=0;
	int syo=0;

	InputStreamReader i = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(i);

	String buf = br.readLine();
	x = Integer.parseInt(buf);
	syo = (int)Math.pow(x,3);

	System.out.println(syo);
    }
}