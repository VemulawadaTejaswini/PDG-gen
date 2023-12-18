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
		String line=sc.nextLine();
		String s="";
		boolean isLetter=true;
		boolean first=true;
		for(char c : line.toCharArray()){
			if(Character.isLetter(c)){
				s+=c;
			}else if(c==' '||c=='.'||c==','){
				if(isLetter&&s.length()>=3&&s.length()<=6){
					print((first?"":" ")+s);
					first=false;
				}
				s="";
				isLetter=true;
			}else{
				isLetter=false;
			}
		}
		if(isLetter&&s.length()>=3&&s.length()<=6){
			print((first?"":" ")+s);
		}
		println("");
	}

	void run_(){
		// String regex="(^| |[,]|\\.)+(\\p{Alpha}{3,6}?)($| |[,]|\\.)+";
		// String regex="(\\G| |[,]|\\.)+(\\p{Alpha}{3,6}?)($| |[,]|\\.)+";
		String regex="(\\G|^| |[,]|\\.)+(\\p{Alpha}{3,6}?)($| |[,]|\\.)+";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(sc.nextLine());
		if(matcher.find()){
			for(;;){
				print(matcher.group(2));
				// debug(matcher.group());
				if(matcher.find()){
					print(" ");
				}else{
					break;
				}
			}
		}
		// println("");
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
		new Main().run();
	}
}