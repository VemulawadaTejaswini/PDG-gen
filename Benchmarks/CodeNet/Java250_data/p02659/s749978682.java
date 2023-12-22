import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] lo= reader.readLine().split(" ");
		long a = Long.parseLong(lo[0]);
		char[] pol = lo[1].toCharArray();
		String h = "";
		for(int i =0;i<pol.length;i++){
			if(pol[i]=='.') continue;
			else h = h + pol[i];
		}
		long pow =Long.parseLong(h);
		long res = (pow*a)/100;
		System.out.println(res);
	}
}
