import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String moji = br.readLine();
	String cap = moji.toUpperCase();
	System.out.println(cap);
    }
}
	    