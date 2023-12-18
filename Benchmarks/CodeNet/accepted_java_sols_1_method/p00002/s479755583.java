import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	String s;
	long i,j;
	long len;
	String[] list;
	while((s = buf.readLine()) != null){
	    list = s.split(" ");
	    i = Integer.parseInt(list[0]);
	    j = Integer.parseInt(list[1]);
	    len = i + j;
	    s = Long.toString(len);
	    System.out.println(s.length());
	}
    }
}