import java.io.*;
public class Main {
   public static void main(String[] args) throws IOException{
	  BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	  int i,j;
	  String s = buf.readLine();
	  i = Integer.parseInt(s);
	  s = buf.readLine();
	  j = Integer.parseInt(s);
	  System.out.println(i*j + " " + 2*(i+j));
   }
}