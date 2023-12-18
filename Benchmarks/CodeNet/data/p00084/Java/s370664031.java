import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-9;

	void run(){
		sc=new Scanner(System.in);
		Pattern pattern=Pattern
				.compile("(\\G|\\s|,|\\.)\\p{Alpha}{3,6}?($|\\s|,|\\.)");
		String line=sc.nextLine();

		Matcher matcher=pattern.matcher(line);
		if(matcher.find())
			while(true){
				String s=matcher.group();
				s=s.replaceAll("\\s|,|\\.", "");
				print(s);
				if(matcher.find())
					print(" ");
				else
					break;
			}
		println("");
		sc.close();
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}