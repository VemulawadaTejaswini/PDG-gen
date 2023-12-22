import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		System.out.println(in.substring(0,4)+" "+in.substring(4));
	}
}