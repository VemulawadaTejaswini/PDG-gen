import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		while((str = br.readLine()) != null){
			String[] num = str.split(" ",0);
			int x = Integer.parseInt(num[0]);
			int y = Integer.parseInt(num[1]);
			int z = x + y;
			System.out.println(String.valueOf(z).length());
		}
	}
}