import java.io.*;

class Main{
    public static void main(String[] a){

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	String buf = br.readLine();
	
	int num = Integer.parseInt(buf);

	System.out.println(num);
    }
}