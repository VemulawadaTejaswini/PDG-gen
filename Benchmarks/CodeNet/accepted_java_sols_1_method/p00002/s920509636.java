import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = br.readLine()) != null){
			String[] strs = line.split(" ", 2);
			int num1 = Integer.parseInt(strs[0]);
			int num2 = Integer.parseInt(strs[1]);
			int num = num1 + num2;
			String str = String.valueOf(num);
			System.out.println(str.length());
		}
	}
}