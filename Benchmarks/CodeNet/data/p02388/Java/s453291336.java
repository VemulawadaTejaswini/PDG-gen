import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[])throws IOException{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 double a=Double.parseDouble(br.readLine());
	 int x=(int)Math.pow(a,3);
	System.out.print(x);
	}
} 