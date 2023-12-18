import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);;

	int INF=1<<28;
	double EPS=1e-9;

	void run(){
		String regex="(\\G| |[,]|\\.)(\\p{Alpha}{3,6}?)($| |[,]|\\.)";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(sc.nextLine());
		if(matcher.find()){
			for(;;){
				print(matcher.group(2));
				if(matcher.find()){
					print(" ");
				}else{
					break;
				}
			}
		}
		println("");
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