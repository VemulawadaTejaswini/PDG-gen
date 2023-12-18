import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while(true){
			/* input from here */
			line = r.readLine();
			//s: num of hot springs, d: num of districts
			int s, d, min=100, minindex=0;
			s = Integer.parseInt(line.split("[ \t]")[0]);
			d = Integer.parseInt(line.split("[ \t]")[1]);
			if(s==0&&d==0){
				break;
			}
			System.out.println(0);
			return;
		}
	}
}