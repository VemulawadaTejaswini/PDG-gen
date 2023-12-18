import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	void run(){
		for(int n=sc.nextInt(); n>0; n--){
			String s=sc.next();
			// debug(s);
			Matcher m=Pattern.compile("^>'(=+)#(=+)~$").matcher(s);
			if(m.find()){
				// debug(m.group(1), m.group(2));
				if(m.group(1).length()==m.group(2).length()){
					// debug("A");
					println("A");
					continue;
				}
			}
			m=Pattern.compile("^>\\^(Q=)+~~$").matcher(s);
			if(m.find()){
				// debug("B");
				println("B");
				continue;
			}
			// debug("NA");
			println("NA");
		}
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}