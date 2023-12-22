import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		char[] in=s.toCharArray();
		for(int i=in.length-1;i>=0;i--)System.out.print(in[i]);
		System.out.println();
	}
}