import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException
    {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String buf = br.readLine();
	int num = Integer.parseInt(buf);

	num = (int)Math.pow(num,3);
	System.out.println(num);
    }
}