import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
class Main{
	public static void main(String[] args) {
		InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
      	char c=in.next().charAt(0);
		if(c>=65 && c<=90)
			System.out.println('A');
		else
			System.out.println('a');
	} 
}
